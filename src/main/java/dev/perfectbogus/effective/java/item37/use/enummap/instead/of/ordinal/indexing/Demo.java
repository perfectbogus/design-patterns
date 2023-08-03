/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.item37.use.enummap.instead.of.ordinal.indexing;

import dev.perfectbogus.effective.java.item37.use.enummap.instead.of.ordinal.indexing.problem.Plant;
import dev.perfectbogus.effective.java.item37.use.enummap.instead.of.ordinal.indexing.solution.Phase;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

public class Demo {

  private static Plant[] garden = { new Plant("Sensitive", Plant.LifeCycle.BIENNIAL),
      new Plant("Sedron", Plant.LifeCycle.PERENNIAL) };
  /**
   * Notes:
   *  Item28 - Arrays are not compatible with generics, this program requires an unchecked cast and
   *          will not compile cleanly, Because the array does not know what its index represents
   *          Most Serious Problem: when you access and array that is indexed by an enum's ordinal
   * @param args
   */
  public static void wrongImplementation(String[] args) {
    Set<Plant>[] plantsByLifeCycle =
        (Set<Plant>[]) new Set[Plant.LifeCycle.values().length];

    for (int i = 0; i < plantsByLifeCycle.length; i++) {
      plantsByLifeCycle[i] = new HashSet<>();
    }

    for (Plant p : garden) {
      plantsByLifeCycle[p.lifeCycle.ordinal()].add(p);
    }

    for (int i = 0; i < plantsByLifeCycle.length; i++) {
      System.out.printf("%s: %s%n", Plant.LifeCycle.values()[i], plantsByLifeCycle[i]);
    }

  }

  public static void rightImplementation(String[] args) {
    Map<Plant.LifeCycle, Set<Plant>> plantsByLifeCycle =
        new EnumMap<>(Plant.LifeCycle.class);

    for (Plant.LifeCycle lc : Plant.LifeCycle.values()) {
      plantsByLifeCycle.put(lc, new HashSet<>());
    }

    for (Plant p : garden) {
      plantsByLifeCycle.get(p.lifeCycle).add(p);
    }
    System.out.println(plantsByLifeCycle);

  }

  // unlikely to produce and EnumMap
  public static void usingStream() {
    System.out.println(
        Arrays.stream(garden).collect(groupingBy(p -> p.lifeCycle))
    );
  }

  // Using a stream and an EnumMap to associate data with an enum
  public static void usingStreamAndEnumMap() {
    System.out.println(
        Arrays.stream(garden).collect(groupingBy(
            plant -> plant.lifeCycle,
            () -> new EnumMap<>(Plant.LifeCycle.class),
            toSet()))
    );
  }

  public static void main(String[] args) {
    Phase.Transition t = Phase.Transition.from(Phase.LIQUID, Phase.SOLID);
    System.out.println(t);
  }

}

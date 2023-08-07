/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.methods.item52.use.overloading.judiciously;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DemoSetList {
  public static void main(String[] args) {

    unexpectedBehavior();
    expectedBehavior();

  }

  /**
   * This method is call the remove(object) function
   *
   * Prints:
   *  [-3, -2, -1] [-3, -2, -1]
   */
  private static void expectedBehavior() {
    Set<Integer> set = new TreeSet<>();
    List<Integer> list = new ArrayList<>();

    for (int i = -3; i < 3; i++) {
      set.add(i);
      list.add(i);
    }

    for (int i = 0; i < 3; i++) {
      set.remove(i);
      list.remove(Integer.valueOf(i));
    }
    System.out.println(set + " " + list);
  }

  /**
   * This method is calling the remove(index) function.
   *
   * Prints:
   *  [-3, -2, -1] [-2, 0, 2]
   */
  private static void unexpectedBehavior() {
    Set<Integer> set = new TreeSet<>();
    List<Integer> list = new ArrayList<>();

    for (int i = -3; i < 3; i++) {
      set.add(i);
      list.add(i);
    }

    for (int i = 0; i < 3; i++) {
      set.remove(i);
      list.remove(i);
    }
    System.out.println(set + " " + list);
  }
}

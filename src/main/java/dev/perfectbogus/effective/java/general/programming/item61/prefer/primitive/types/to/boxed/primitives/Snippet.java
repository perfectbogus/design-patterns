/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.general.programming.item61.prefer.primitive.types.to.boxed.primitives;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Snippet {

  public static Comparator<Integer> naturalOrder = (i, j) -> (i < j) ? -1 : (i == j ? 0 : 1);

  public static Comparator<Integer> fixedNaturalOrder = (iBoxed, jBoxed) -> {
    int i = iBoxed;
    int j = jBoxed;
    return i < j ? -1 : (i == j ? 0 : 1);
  };

  static Integer i;
  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();

    Integer a = Integer.parseInt("45");
    Integer b = Integer.parseInt("45");


    // You are comparing a integer(unboxed) with an Integer(not unboxed) so, they are not equals
    System.out.println(naturalOrder.compare(new Integer("45"), new Integer("45")));

    System.out.println(fixedNaturalOrder.compare(a, b));

    //delightful();
    slowExample();
  }

  /**
   * throws a Null Pointer Exception
   */
  private static void delightful() {
    if (i == 42) {
      System.out.println("Unbelievable");
    }
  }

  private static void slowExample() {
    Long sum = 0L;

    for (long i = 0; i < Integer.MIN_VALUE; i++) {
      sum += i;
    }

    System.out.println(sum);
  }

}

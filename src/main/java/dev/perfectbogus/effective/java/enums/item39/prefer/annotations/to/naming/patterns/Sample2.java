/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.enums.item39.prefer.annotations.to.naming.patterns;

public class Sample2 {
  @ExceptionTest(ArithmeticException.class)
  public static void m1() {
    int i = 0;
    i = i / i;
  }

  @ExceptionTest(ArithmeticException.class)
  public static void m2() {
    // Should fail (wrong exception)
    int[] a = new int[0];
    int i = a[1];
  }

  @ExceptionTest(ArithmeticException.class)
  public static void m3() {
    // Should fail (no exception)
  }

}



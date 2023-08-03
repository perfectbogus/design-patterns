/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.enums.item39.prefer.annotations.to.naming.patterns;

public class Sample {

  @Test
  public static void m1() {

  }

  public static void m2() {

  }

  @Test
  public static void m3() {
    throw new RuntimeException("Boom");
  }

  public static void m4() {

  }

  @Test
  public void m5() {
    // INVALID USE: nonstatic method
  }

  public static void m6() {

  }

  @Test
  public static void m7() {
    // Test Should fail
    throw new RuntimeException("Crash");
  }

  public static void m8() {

  }


}

/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.enums.item39.prefer.annotations.to.naming.patterns;

public class Sample4 {
  @RepeatableExceptionTest(IndexOutOfBoundsException.class)
  @RepeatableExceptionTest(NullPointerException.class)
  public static void doublyBad() {

  }

}


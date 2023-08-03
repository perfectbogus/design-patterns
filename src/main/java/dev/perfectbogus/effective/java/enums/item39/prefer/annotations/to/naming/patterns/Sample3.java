/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.enums.item39.prefer.annotations.to.naming.patterns;

import java.util.ArrayList;
import java.util.List;

public class Sample3 {

  @MultipleExceptionTest({IndexOutOfBoundsException.class, NullPointerException.class})
  public static void doublyBad() {
    List<String> list = new ArrayList<>();
    list.addAll(5, null);
  }
}

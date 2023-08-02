/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.item36.use.enumset.instead.of.bit.fields;

import dev.perfectbogus.effective.java.item36.use.enumset.instead.of.bit.fields.problem.TextProblem;
import dev.perfectbogus.effective.java.item36.use.enumset.instead.of.bit.fields.solution.TextSolution;

import java.util.EnumSet;
import java.util.Set;

public class Demo {

  public static void main(String[] args) {
    // OBSOLETE EXAMPLE
    int bitwise = TextProblem.STYLE_BOLD | TextProblem.STYLE_BOLD;
    applyStyles(bitwise);

    // SOLUTION
    EnumSet<TextSolution.Style> set = EnumSet.of(TextSolution.Style.BOLD, TextSolution.Style.ITALIC);
    applyStyles(set);
  }

  public static void applyStyles(int Style) {
  }

  /**
   * Notes: this method takes Set<Style> rather than an EnumSet<Style>
   *   It is generally good practice to accept the interface type rather than the implmentation
   *   type.
   */
  public static void applyStyles(Set<TextSolution.Style> styles) {

  }
}

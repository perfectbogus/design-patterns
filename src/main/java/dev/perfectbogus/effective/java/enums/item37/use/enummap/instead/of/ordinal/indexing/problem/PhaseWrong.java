/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.enums.item37.use.enummap.instead.of.ordinal.indexing.problem;

// DON'T DO THIS

/**
 * iif you make a mistake in the trnasition table or forget to update it when you modify
 * the Phase or Phase.Transition enum type, your progrma will fail at runtime
 * the failure may be an ArrayIndexOutofBoundsException, a NullPointerException or worse silent
 * erroneous behavior.
 */
public enum PhaseWrong {
  SOLID, LIQUID, GAS;

  public enum Transition {
    MELT, FREEZE, BOIL, CONDENSE, SUBLIME, DEPOSIT;

    private static final Transition[][] TRANSITIONS = {
        {null, MELT, SUBLIME},
        {FREEZE, null, BOIL},
        {DEPOSIT, CONDENSE, null}
    };

    public static Transition from(PhaseWrong from, PhaseWrong to) {
      return TRANSITIONS[from.ordinal()][to.ordinal()];
    }
  }

}

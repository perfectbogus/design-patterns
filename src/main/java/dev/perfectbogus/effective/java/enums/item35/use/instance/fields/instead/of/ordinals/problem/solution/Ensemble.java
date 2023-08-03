/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.enums.item35.use.instance.fields.instead.of.ordinals.problem.solution;

public enum Ensemble {
  SOLO(1),
  DUET(2),
  TRIO(3),
  DOUBLE_QUARTET(8),
  TRIPLE_QUARTET(12);

  private final int numberOfMusicians;
  Ensemble(int size) {
    this.numberOfMusicians = size;
  }

  public int getNumberOfMusicians() {
    return numberOfMusicians;
  }


}

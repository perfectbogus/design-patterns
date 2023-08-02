/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.item35.use.instance.fields.instead.of.ordinals.problem;

// DON'T DO THIS
public enum Ensemble {
  SOLO,
  DUET,
  TRIO,
  QUARTET,
  QUINTET;

  //What happened if you want to add a tripe quartet? or a Double Quartet

  public int numberOfMusicians() {
    return ordinal() + 1;
  }

}

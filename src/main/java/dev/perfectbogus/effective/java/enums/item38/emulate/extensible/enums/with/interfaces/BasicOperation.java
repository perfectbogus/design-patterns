/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.enums.item38.emulate.extensible.enums.with.interfaces;

public enum BasicOperation implements Operation {

  PLUS("+") {
    @Override
    public double apply(double x, double y) {
      return x + y;
    }
  },
  MINUS("-") {
    @Override
    public double apply(double x, double y) {
      return x - y;
    }
  };

  private final String symbol;

  BasicOperation(String symbol) {
    this.symbol = symbol;
  }

  @Override
  public String toString() {
    return symbol;
  }


}

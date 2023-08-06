/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.lambdas.and.streams.item42.prefer.lambdas.to.anonymous.classes;

import java.util.function.DoubleBinaryOperator;

public enum Operation {
  PLUS("+", (x, y) -> x + y ),
  MINUS("-", (x, y) -> x - y);

  private final String symbol;
  private final DoubleBinaryOperator op;

  Operation(String symbol, DoubleBinaryOperator op) {
    this.symbol = symbol;
    this.op = op;
  }

  @Override
  public String toString() {
    return symbol;
  }

  public double apply(double x, double y) {
    return op.applyAsDouble(x, y);
  }

}

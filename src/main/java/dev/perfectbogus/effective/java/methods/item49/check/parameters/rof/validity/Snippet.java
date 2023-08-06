/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.methods.item49.check.parameters.rof.validity;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static java.math.BigInteger.ONE;

public class Snippet {

  public void nullCheckingFacility(String[] args) {
    String[] data = Objects.requireNonNull(args);
    Map<String, Integer> testMap = new HashMap<>();
    Map<String, Integer> dataMap = Objects.requireNonNull(testMap);
  }

  /**
   * Return a BigInteger whose value is (this mod m). This method
   * differs from the remainder method in that it always return a
   * non-negative BigInteger.
   *
   * @param m the modulus, which must be positive
   * @return this mod m
   * @throws ArithmeticException if m is less than or equal to Zero
   */
  public BigInteger validateBeforeToUseIt(BigInteger m) {
    if (m.signum() <= 0) {
      throw new ArithmeticException("Modulus <= 0: "  + m);
    }
    //Do the Computation
    return new BigInteger("1");
  }
}

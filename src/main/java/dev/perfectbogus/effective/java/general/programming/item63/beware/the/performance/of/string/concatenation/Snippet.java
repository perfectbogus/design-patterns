/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.general.programming.item63.beware.the.performance.of.string.concatenation;

public class Snippet {

  private static int LINE_WIDTH = 1;
  public static void main(String[] args) {

  }

  //Inappropiate use of string concatenation - Performs poorly!
  public String statement() {
    String result = "";
    for (int i = 0; i < numItems(); i++) {
      result += lineForItem(i);
    }
    return result;
  }

  public String betterPerformanceStatement() {
    StringBuilder b = new StringBuilder(numItems() * LINE_WIDTH);
    for (int i = 0; i < numItems(); i++) {
      b.append(lineForItem(i));
    }
    return b.toString();
  }

  private String lineForItem(int i) {
    return new String();
  }

  private int numItems() {
    return 0;
  }


}

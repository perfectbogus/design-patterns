/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.methods.item53.use.varargs.judiciously;

public class Snippet {

  public static void main(String[] args) {
    // Sum(1,2,3) expect 6
    int resultA = sum(1, 2, 3);
    // Sum() expect 0
    int resultB = sum();
  }

  private static int sum(int... args) {
    int sum = 0;
    for (int arg : args) {
      sum += arg;
    }
    return sum;
  }

  //Wrong way to use varargs
  private static int min(int... args) {
    if (args.length == 0) {
      throw new IllegalArgumentException("Too few arguments");
    }
    int min = args[0];
    for (int i = 1; i < args.length; i++) {
      if (args[i] < min) {
        min = args[i];
      }
    }
    return min;
  }

  // right way to use varargs
  private static int min(int firstArg, int... remainingArgs) {
    int min = firstArg;
    for (int arg : remainingArgs) {
      if (arg < min) {
        min = arg;
      }
    }
    return min;
  }

}

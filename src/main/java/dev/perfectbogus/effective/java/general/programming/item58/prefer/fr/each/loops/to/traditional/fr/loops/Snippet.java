/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.general.programming.item58.prefer.fr.each.loops.to.traditional.fr.loops;

import java.util.Iterator;
import java.util.List;

public class Snippet {
  public static void main(String[] args) {

  }

  // Not the best way to iterate over a collection
  private static void iterateCollection(List<String> elements) {
    for (Iterator<String> i = elements.iterator(); i.hasNext(); ) {
      String s = i.next();
      doSomething();
    }
  }

  private static void iterateArray(int[] data) {
    for (int i = 0; i < data.length; i++) {
      doSomething();
    }
  }

  private static void doSomething() {

  }

}

/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.general.programming.item57.minimize.the.scope.of.local.variables;

import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Snippet {
  public static void main(String[] args) {
    List<String> elements = new ArrayList<>();
    List<String> elements2 = new ArrayList<>();

    //Preferable
    iterateOverCollection(elements);

    //when you need the iterator
    iterateNeedIterator(elements);

    //Bug
    bugIterate(elements, elements2);

    //Compile Error
    compileTimeErrorInForLoop(elements, elements2);

  }

  private static void compileTimeErrorInForLoop(List<String> a, List<String> b) {
    for (Iterator<String> i = a.iterator(); i.hasNext(); ) {
      String s = i.next();
      doSomething();
    }
// This not compile (compile error due to is using i instead of i2
//    for (Iterator<String> i2 = b.iterator(); i.hasNext(); ) {
//      String e2 = i2.next();
//      doSomething();
//    }
  }

  private static void iterateNeedIterator(List<String> elements) {
    for (Iterator<String> i = elements.iterator(); i.hasNext(); ) {
      String s = i.next();
      doSomething();
    }
  }

  private static void bugIterate(List<String> elements, List<String> anotherElements) {
    Iterator<String> i = elements.iterator();
    while (i.hasNext()) {
      doSomething(i.next());
    }
    Iterator<String> i2 = anotherElements.iterator();
    while (i.hasNext()) {// BUG, you are using i instead of i2
      doSomething(i2.next());
    }
  }


  private static void iterateOverCollection(List<String> elements) {
    for (String s : elements) {
      doSomething();
    }
  }


  private static void doSomething(String element) {

  }
  private static void doSomething() {

  }
}

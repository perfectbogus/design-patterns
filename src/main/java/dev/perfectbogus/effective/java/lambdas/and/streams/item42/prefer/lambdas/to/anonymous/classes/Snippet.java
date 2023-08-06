/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.lambdas.and.streams.item42.prefer.lambdas.to.anonymous.classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import static java.util.Comparator.comparingInt;
import java.util.List;

public class Snippet {

  List<String> words = Arrays.asList("data", "another");

  //Anonymous class instance as a function object - obsolete
  public void anonymousClass() {
    Collections.sort(words, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
      }
    });
  }

  public void lambdaExpression() {
    Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
  }

  public void shortLambdaExpression() {
    Collections.sort(words, comparingInt(String::length));
  }

  public void shorterLambdaExpression() {
    words.sort(comparingInt(String::length));
  }
}

/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.enums.item40.consistently.use.the.override.annotation;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bigram {

  private final char first;
  private final char second;

  public Bigram(char first, char second) {
    this.first = first;
    this.second = second;
  }

//  public boolean equals(Object o) {
//    if (this == o) return true;
//    if (o == null || getClass() != o.getClass()) return false;
//    Bigram bigram = (Bigram) o;
//    return first == bigram.first && second == bigram.second;
//  }

  // You will get a bug, since the equals function is not overriding the supetype
  // function so, you are getting a different objects when they really are the same.
  public boolean equals(Bigram bigram) {
    return bigram.first == first && bigram.second == second;
  }
  public int hashCode() {
    return Objects.hash(first, second);
  }

  public static void main(String[] args) {
    Set<Bigram> s = new HashSet<>();
    for (int i = 0; i < 10; i++) {
      for (char ch = 'a'; ch <= 'z'; ch++) {
        s.add(new Bigram(ch, ch));
      }
    }
    System.out.println(s.size());
  }
}

/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.methods.item52.use.overloading.judiciously;

import java.util.List;

public class DemoWine {
  public static void main(String[] args) {
    List<Wine> wines = List.of(new Wine(), new SparklingWine(), new Champagne());

    for (Wine wine : wines) {
      System.out.println(wine.name());
    }
  }
}

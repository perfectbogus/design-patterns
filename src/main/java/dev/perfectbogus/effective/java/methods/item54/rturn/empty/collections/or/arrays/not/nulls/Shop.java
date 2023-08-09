/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.methods.item54.rturn.empty.collections.or.arrays.not.nulls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Shop {

  public static List<Cheese> cheesesInStock;


  //Wrong Case
  public static List<Cheese> getCheeses() {
    return cheesesInStock.isEmpty() ? null : new ArrayList<>();
  }

  //Better case
  public static List<Cheese> getCheesesInStock() {
    return new ArrayList<>(cheesesInStock);
  }

  //Optimizations - avoids allocating empty collections
  public List<Cheese> optimizedGetCheeses() {
    return cheesesInStock.isEmpty() ? Collections.emptyList() : new ArrayList<>(cheesesInStock);
  }

}

/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.methods.item54.rturn.empty.collections.or.arrays.not.nulls;

import java.util.List;

public class ClientCheese {

  //Client have to make an extra validation to avoid nulls
  private void validations() {
    List<Cheese> cheeses = Shop.getCheeses();
    if (cheeses != null && cheeses.contains(Cheese.STILTON)) {
      System.out.println("Jolly Good, just the thing.");
    }

  }
}

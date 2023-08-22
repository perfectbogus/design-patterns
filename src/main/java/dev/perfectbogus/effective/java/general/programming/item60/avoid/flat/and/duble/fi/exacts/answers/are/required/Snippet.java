/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.general.programming.item60.avoid.flat.and.duble.fi.exacts.answers.are.required;

import java.math.BigDecimal;

public class Snippet {

  public static void main(String[] args) {
    // you get .000..001 at the end on the
    System.out.println(1.03 - 0.42);

    System.out.println(1.00 - 9 * 0.10);

    buyCandies();
    buyCandiesBigDecimal();
  }

  // Broken - use floating point for monetary calculations
  private static void buyCandies() {
    double founds = 1.00;
    int itemsBought = 0;

    for (double price = 0.10; founds >= price; price += 0.10) {
      founds -= price;
      itemsBought++;
    }
    System.out.println(itemsBought + " items bought.");
    System.out.println("Change: $" + founds);
  }

  public static void buyCandiesBigDecimal() {
    final BigDecimal TEN_CENTS = new BigDecimal(".10");
    int itemsBought = 0;
    BigDecimal funds = new BigDecimal("1.00");

    for (BigDecimal price = TEN_CENTS;
         funds.compareTo(price) >= 0;
         price = price.add(TEN_CENTS)) {
      funds = funds.subtract(price );
      itemsBought++;
      System.out.println("funds left:" + funds);
    }
    System.out.println(itemsBought + " items bought.");
    System.out.println("Change: $" + funds);
  }
}

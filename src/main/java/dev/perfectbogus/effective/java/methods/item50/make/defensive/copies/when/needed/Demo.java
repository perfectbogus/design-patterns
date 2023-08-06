/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.methods.item50.make.defensive.copies.when.needed;

import java.util.Date;

public class Demo {

  public static void main(String[] args) {
    Date start = new Date();
    Date end = new Date();

    Period p = new Period(start, end);
    end.setYear(78);
  }
}

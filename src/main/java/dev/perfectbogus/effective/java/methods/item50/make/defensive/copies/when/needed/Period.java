/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.methods.item50.make.defensive.copies.when.needed;

import java.util.Date;

//Broken "immutable" time period class
public class Period {
  private final Date start;
  private final Date end;

  //Repaired Constructor
  public Period(Date start, Date end) {
    this.start = new Date(start.getTime());
    this.end = new Date(end.getTime());

    if (this.start.compareTo(this.end) > 0) {
      throw new IllegalArgumentException(this.start + " after " + this.end);
    }
  }

  //Obsolete Constructor
//  public Period(Date start, Date end) {
//    if (start.compareTo(end) > 0) {
//      throw new IllegalArgumentException(start + " after " + end);
//    }
//
//    this.start = start;
//    this.end = end;
//  }

  public Date start() {
    return start;
  }

  public Date end() {
    return end;
  }
}

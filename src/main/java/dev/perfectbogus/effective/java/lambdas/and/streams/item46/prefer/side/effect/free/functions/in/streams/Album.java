/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.lambdas.and.streams.item46.prefer.side.effect.free.functions.in.streams;

public class Album {

  private String name;
  private int sales;
  private Artist artist;

  public Album(String name, int sales, Artist artist) {
    this.name = name;
    this.sales = sales;
    this.artist = artist;
  }

  public Artist artist() {
    return this.artist;
  }

  public int sales() {
    return this.sales;
  }
}

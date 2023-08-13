/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.general.programming.item58.prefer.fr.each.loops.to.traditional.fr.loops;

public class Card {

  private Suit suit;
  private Rank rank;

  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public Suit getSuit() {
    return this.suit;
  }

  public Rank getRank() {
    return this.rank;
  }
  @Override
  public String toString() {
    return "Card{" + "suit=" + suit + ", rank=" + rank + '}';
  }
}

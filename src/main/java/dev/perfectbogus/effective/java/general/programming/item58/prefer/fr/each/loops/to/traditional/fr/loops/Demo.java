/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.general.programming.item58.prefer.fr.each.loops.to.traditional.fr.loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class Demo {

  public static void main(String[] args) {

    //BUG
    //List<Card> deckBug = bugCreateDeck();
    //System.out.println(deckBug);

    List<Card> deck = createDeckImproved();

    deck.stream().forEach(card -> {
      System.out.println(card);
      if (card.getSuit() == Suit.CLUB) {
        if (card.getRank() == Rank.ACE) {
          System.out.println("Go Return");
          return;
        }
      }
      System.out.println(card);
    });
    //NO BUG
    createDeck();
    System.out.println(createDeck());

    //Preferred idiom for nested iteration on collections and arrays
    System.out.println(createDeckImproved());
  }

  private static List<Card> createDeckImproved() {
    Collection<Suit> suits = Arrays.asList(Suit.values());
    Collection<Rank> ranks = Arrays.asList(Rank.values());

    List<Card> deck = new ArrayList<>();
    for (Suit suit : suits) {
      for (Rank rank : ranks) {
        deck.add(new Card(suit, rank));
      }
    }

    return  deck;
  }
  private static List<Card> bugCreateDeck() {
    Collection<Suit> suits = Arrays.asList(Suit.values());
    Collection<Rank> ranks = Arrays.asList(Rank.values());

    List<Card> deck = new ArrayList<>();

    for (Iterator<Suit> i = suits.iterator(); i.hasNext(); ) {
      for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); ) {
        deck.add(new Card(i.next(), j.next()));
      }
    }

    return deck;
  }

  private static List<Card> createDeck() {
    Collection<Suit> suits = Arrays.asList(Suit.values());
    Collection<Rank> ranks = Arrays.asList(Rank.values());

    List<Card> deck = new ArrayList<>();

    for (Iterator<Suit> i = suits.iterator(); i.hasNext(); ) {
      Suit s = i.next();
      for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); ) {
        deck.add(new Card(s, j.next()));
      }
    }

    return deck;
  }

  enum Face {
    ONE, TWO, THREE, FOUR, FIVE, SIX
  }

  private static void sameBugAnotherSymptom() {
    Collection<Face> faces = EnumSet.allOf(Face.class);

    for (Iterator<Face> i = faces.iterator(); i.hasNext(); ) {
      for (Iterator<Face> j = faces.iterator(); j.hasNext(); ) {
        System.out.println(i.next() + " " + j.next());
      }
    }
  }

  private static void fixedSymptom() {
    Collection<Face> faces = EnumSet.allOf(Face.class);

    for (Iterator<Face> i = faces.iterator(); i.hasNext(); ) {
      Face outerFace = i.next();
      for (Iterator<Face> j = faces.iterator(); j.hasNext(); ) {
        System.out.println(outerFace + " " + j);
      }
    }
  }

}

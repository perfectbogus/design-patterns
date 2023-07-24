/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.solid.dependency.inversion;

import java.util.List;

public class Research {

//  public Research(Relationships relationships) {
//    List<Triplet> relations = relationships.getRelations();
//    relations.stream()
//        .filter(triplet -> triplet.getUpper().getName().equals("John")
//        && triplet.getRelation() == Relationship.PARENT)
//        .forEach(triplet -> System.out.println("John has a child called " + triplet.getLower().getName()));
//  }

  public Research(RelationshipBrowser browser) {
    List<Person> children = browser.findAllChildrenOf("John");
    for (Person child : children) {
      System.out.println("John has child: " + child.getName());
    }
  }

}

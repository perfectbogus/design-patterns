/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.solid.dependency.inversion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Relationships implements RelationshipBrowser{
  private List<Triplet> relations = new ArrayList<>();

  public List<Triplet> getRelations() {
    return relations;
  }

  public void addParentAndChild(Person parent, Person child) {
    relations.add(new Triplet(parent, Relationship.PARENT, child));
    relations.add(new Triplet(child, Relationship.CHILD, parent));
  }

  @Override
  public List<Person> findAllChildrenOf(String name) {
    return relations.stream()
        .filter(x -> Objects.equals(x.getUpper().getName(), name)
        && x.getRelation() == Relationship.PARENT)
        .map(Triplet::getLower).collect(Collectors.toList());
  }
}

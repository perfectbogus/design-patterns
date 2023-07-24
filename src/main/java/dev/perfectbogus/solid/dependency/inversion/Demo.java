/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.solid.dependency.inversion;

public class Demo {

  public static void main(String[] args) {
    Person parent = new Person("John");
    Person childA = new Person("Chris");
    Person childB = new Person("Matt");

    Relationships relationships = new Relationships();

    relationships.addParentAndChild(parent, childA);
    relationships.addParentAndChild(parent, childB);

    Research research = new Research(relationships);

  }
}

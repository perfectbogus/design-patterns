/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.creational.builder.examples.fluent;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {

  protected Person person = new Person();

  public SELF withName(String name) {
    person.name = name;
    return self();
  }

  public SELF build() {
    return self();
  }

  protected SELF self() {
    return (SELF) this;
  }

}

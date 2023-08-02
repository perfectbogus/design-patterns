/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.creational.builder.examples.facade;

public class PersonBuilder {

  protected Person person = new Person();

  public PersonAddressBuilder lives() {
    return new PersonAddressBuilder(person);
  }

  public Person build() {
    return person;
  }

}

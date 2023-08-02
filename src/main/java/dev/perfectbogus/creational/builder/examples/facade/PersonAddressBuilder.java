/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.creational.builder.examples.facade;

public class PersonAddressBuilder extends PersonBuilder{

  public PersonAddressBuilder(Person person) {
    this.person = person;
  }

  public PersonAddressBuilder at(String streetAddress) {
    person.streetAddress = streetAddress;
    return this;
  }

  public PersonAddressBuilder withPostCode(String postCode) {
    person.postcode = postCode;
    return this;
  }

  public PersonAddressBuilder in(String city) {
    person.city = city;
    return this;
  }



}

/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.creational.builder.examples.facade;

public class PersonJobBuilder extends PersonBuilder {

  public PersonJobBuilder(Person person) {
    this.person = person;
  }

  public PersonJobBuilder at(String companyName) {
    person.companyName = companyName;
    return this;
  }

  public PersonJobBuilder asA(String position) {
    person.position = position;
    return this;
  }

  public PersonJobBuilder earning(int annualIncome) {
    person.annualIncome = annualIncome;
    return this;
  }

}

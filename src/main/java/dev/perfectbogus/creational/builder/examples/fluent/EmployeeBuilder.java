/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.creational.builder.examples.fluent;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

  public EmployeeBuilder worksAt(String position) {
    person.position = position;
    return self();
  }

  @Override
  protected EmployeeBuilder self() {
    return this;
  }

}

/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.creational.builder.examples.fluent;

public class Demo {

  public static void main(String[] args) {
    PersonBuilder pb = new PersonBuilder();
    pb.withName("Lalo").build();

    EmployeeBuilder eb = new EmployeeBuilder();
    Person lalo = eb.withName("Lalo").worksAt("Developer").build().person;


  }
}

/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.creational.builder.examples.facade;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Person {

  public String streetAddress, postcode, city;
  public String companyName, position;
  public int annualIncome;

}

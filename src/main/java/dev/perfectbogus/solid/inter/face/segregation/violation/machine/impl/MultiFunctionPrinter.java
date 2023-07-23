/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.solid.inter.face.segregation.violation.machine.impl;

import dev.perfectbogus.solid.inter.face.segregation.violation.Document;
import dev.perfectbogus.solid.inter.face.segregation.violation.machine.Machine;

public class MultiFunctionPrinter implements Machine {
  @Override
  public void print(Document document) {

  }

  @Override
  public void fax(Document document) {

  }

  @Override
  public void scan(Document document) {

  }
}

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

public class OldFashionedPrinter implements Machine {

  // this class has no fax or scan capabilities, so you have to segregate those
  // functions
  @Override
  public void print(Document document) {

  }

  @Override
  public void fax(Document document) {
    // This will cause that you have to modify the principal interface that you are going to
    // send a exception but you have no control of the machine interface
    //throw new Exception();
  }

  @Override
  public void scan(Document document) {

  }
}

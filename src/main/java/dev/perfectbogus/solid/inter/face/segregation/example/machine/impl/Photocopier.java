/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.solid.inter.face.segregation.example.machine.impl;

import dev.perfectbogus.solid.inter.face.segregation.example.machine.Printer;
import dev.perfectbogus.solid.inter.face.segregation.example.machine.Scanner;
import dev.perfectbogus.solid.inter.face.segregation.violation.Document;

public class Photocopier implements Printer, Scanner {
  @Override
  public void print(Document document) {
    System.out.println("Print Document");
  }

  @Override
  public void scan(Document document) {
    System.out.println("Scan Document");
  }

}

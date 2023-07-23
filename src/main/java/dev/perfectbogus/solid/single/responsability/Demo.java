/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.solid.single.responsability;

import java.time.Instant;

public class Demo {

  public static void main(String[] args) throws Exception {
    Journal j = new Journal();

    j.addEntry("I ate a bug");
    j.addEntry("I did SRP");

    Persistence p = new Persistence();
    String filename = "/tmp/journal_" + Instant.now().toString() + ".txt";
    p.saveToFile(j, "/tmp/journal_" + filename, true);

    System.out.println(j);
  }
}

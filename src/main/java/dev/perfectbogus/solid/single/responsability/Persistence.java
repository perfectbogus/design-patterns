/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.solid.single.responsability;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

public class Persistence {

  public void saveToFile(Journal journal, String filename, boolean overwrite) throws FileNotFoundException {
    if (overwrite || new File(filename).exists()) {
      try (PrintStream out = new PrintStream(filename)) {
        out.println(toString());
      }
    }
  }

  public void load(String filename) {

  }

  public void load(URL url) {

  }

}

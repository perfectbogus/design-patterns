/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.general.programming.item64.refer.to.objects.by.their.interfaces;

import java.util.LinkedHashSet;
import java.util.Set;

public class Snippet {

  public static void main(String[] args) {

    //Good - uses interface as type
    Set<Son> sonSet = new LinkedHashSet<>();

    //Bad -- uses class as type!
    LinkedHashSet<Son> sonSet2 = new LinkedHashSet<>();
  }

  private static class Son {

  }

}

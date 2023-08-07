/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.methods.item52.use.overloading.judiciously;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionClassifier {

  public static String classify(Set<?> set) {
    return "Set";
  }

  public static String classify(List<?> lst) {
    return "List";
  }

  public static String classify(Collection<?> c ) {
    return "Unknown Collection";
  }

  public static void main(String[] args) {
    Collection<?>[] collections = {
        new HashSet<String>(),
        new ArrayList<BigInteger>(),
        new HashMap<String, String>().values()
    };

    for (Collection<?> c : collections) {
      System.out.println(classify(c));
    }
    // prints only "Unknown Collection"
  }
}

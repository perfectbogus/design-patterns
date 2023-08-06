/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.lambdas.and.streams.item43.prefer.method.references.to.lambdas;

import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.ToIntFunction;

public class Snippet {

  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();

    // Boilerplate example
    map.merge("key", 2, (count, incr) -> count + incr);

    // simple
    map.merge("key", 2, Integer::sum);

    /**
     *
     *  Static      Integer::parseInt           str -> Integer.parseInt(str)
     *  Bound       Instant.now()::isAfter      Instant then = Instant.now(); t -> then.isAfter(t)
     *  Unbound     String::toLowerCase         str -> str.toLowerCase()
     *  Class
     *  Constructor TreeMap<K,V>::new           () -> new TreeMap<K,V>()
     *  Array
     *  Constructor int[]::new                  len -> new int[len]
     *
     */


  }
}

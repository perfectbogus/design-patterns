/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.lambdas.and.streams.item47.prefer.collection.to.stream.as.a.returns.type;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Snippet {

  public static void hideousWorkAroundToIterateOverAStream() {
    for (ProcessHandle ph : (Iterable<ProcessHandle>) ProcessHandle.allProcesses()::iterator) {
      //do nothing
    }
  }

  public static void iterateOverAStreamWithForEach() {
    for (ProcessHandle p : iterableOf(ProcessHandle.allProcesses())) {
      //do nothing
    }
  }

  //Create an adaptor to let you iterate a Stream
  public static <E> Iterable<E> iterableOf(Stream<E> stream) {
    return stream::iterator;
  }

  //Adapter from Iterable to Stream
  public static <E> Stream<E> streamOf(Iterable<E> iterable) {
    return StreamSupport.stream(iterable.spliterator(), false);
  }
}

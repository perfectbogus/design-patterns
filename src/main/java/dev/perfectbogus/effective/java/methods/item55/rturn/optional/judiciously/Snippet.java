/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.methods.item55.rturn.optional.judiciously;

import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;

public class Snippet {

  public static void main(String[] args) {

  }

  // throws exception if empty
  public static <E extends Comparable<E>> E max(Collection<E> collection) {
    if (collection.isEmpty()) {
      throw new IllegalArgumentException("Empty Collection");
    }
    E result = null;
    for (E e : collection) {
      if (result == null || e.compareTo(result) > 0) {
        result = Objects.requireNonNull(e);
      }
    }
    return result;
  }

  // Return maximum value in collection as am Optional<E>
  public static <E extends Comparable<E>> Optional<E> optionalMax(Collection<E> collection) {
    if (collection.isEmpty()) {
      return Optional.empty();
    }

    E result = null;
    for (E e : collection) {
      if (result == null || e.compareTo(result) > 0) {
        result = Objects.requireNonNull(e);
      }
    }
    return Optional.of(result);
  }

  //Returns mac val in collection as Optional<E> -- uses stream
  public static <E extends Comparable<E>> Optional<E> streamOptionalMax(Collection<E> collection) {
    return collection.stream().max(Comparator.naturalOrder());
  }


}

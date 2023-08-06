/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.lambdas.and.streams.item44.favor.the.use.of.standard.functional.interfaces;

import java.util.Map;

@FunctionalInterface
public interface EldestEntryRemovalFunction<K,V> {
  boolean remove(Map<K, V> map, Map.Entry<K, V> eldest);

}

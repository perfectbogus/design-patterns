/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.solid.open.closed.filter;

import dev.perfectbogus.solid.open.closed.specification.Specification;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {

  Stream<T> filter(List<T> items, Specification<T> spec);

}

/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.solid.open.closed.filter.impl;

import dev.perfectbogus.solid.open.closed.props.Product;
import dev.perfectbogus.solid.open.closed.filter.Filter;
import dev.perfectbogus.solid.open.closed.specification.Specification;

import java.util.List;
import java.util.stream.Stream;

public class BetterFilter implements Filter<Product> {
  @Override
  public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
    return items.stream().filter(spec::isSatisfied);
  }

}

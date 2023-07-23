/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.solid.open.closed.specification.impl;

import dev.perfectbogus.solid.open.closed.props.Product;
import dev.perfectbogus.solid.open.closed.props.Size;
import dev.perfectbogus.solid.open.closed.specification.Specification;

public class SizeSpecification implements Specification<Product> {

  private Size size;

  public SizeSpecification(Size size) {
    this.size = size;
  }
  @Override
  public boolean isSatisfied(Product item) {
    return item.size == size;
  }

}

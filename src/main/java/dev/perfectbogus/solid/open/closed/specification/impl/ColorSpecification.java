/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.solid.open.closed.specification.impl;

import dev.perfectbogus.solid.open.closed.props.Color;
import dev.perfectbogus.solid.open.closed.props.Product;
import dev.perfectbogus.solid.open.closed.specification.Specification;

public class ColorSpecification implements Specification<Product> {

  private Color color;

  public ColorSpecification(Color color) {
    this.color = color;
  }
  @Override
  public boolean isSatisfied(Product item) {
    return item.color == color;
  }

}

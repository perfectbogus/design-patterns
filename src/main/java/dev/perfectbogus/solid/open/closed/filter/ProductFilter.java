/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.solid.open.closed.filter;

import dev.perfectbogus.solid.open.closed.props.Size;
import dev.perfectbogus.solid.open.closed.props.Color;
import dev.perfectbogus.solid.open.closed.props.Product;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

  public Stream<Product> filterByColor(List<Product> products, Color color) {
    return products.stream().filter(product -> product.color == color);
  }

  public Stream<Product> filterBySize(List<Product> products, Size size) {
    return products.stream().filter(product -> product.size == size);
  }

  public Stream<Product> filterBySizeAndColor(List<Product> products, Color color, Size size) {
    return products.stream().filter(product -> product.size == size && product.color == color);
  }

}

/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.solid.open.closed;

import dev.perfectbogus.solid.open.closed.filter.ProductFilter;
import dev.perfectbogus.solid.open.closed.filter.impl.BetterFilter;
import dev.perfectbogus.solid.open.closed.props.Color;
import dev.perfectbogus.solid.open.closed.props.Product;
import dev.perfectbogus.solid.open.closed.props.Size;
import dev.perfectbogus.solid.open.closed.specification.impl.AndSpecification;
import dev.perfectbogus.solid.open.closed.specification.impl.ColorSpecification;
import dev.perfectbogus.solid.open.closed.specification.impl.SizeSpecification;

import java.util.List;

public class Demo {

  public static void main(String[] args) {
    Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
    Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
    Product house = new Product("House", Color.BLUE, Size.LARGE);

    List<Product> products = List.of(apple, tree, house);

    ProductFilter pf = new ProductFilter();

    System.out.println("Green Products (old):");
    pf.filterByColor(products, Color.GREEN)
        .forEach(product -> System.out.println(product.name + " is Green"));


    BetterFilter bf = new BetterFilter();
    System.out.println("Green Products (new):");
    bf.filter(products, new ColorSpecification(Color.GREEN))
        .forEach(product -> System.out.println(" - " + product.name + " is green"));


    System.out.println("Large and Blue Items:");
    bf.filter(products,
        new AndSpecification<>(
            new ColorSpecification(Color.BLUE),
            new SizeSpecification(Size.LARGE)
        ))
        .forEach(product -> System.out.println(" - " + product.name + " is large and blue"));

  }
}

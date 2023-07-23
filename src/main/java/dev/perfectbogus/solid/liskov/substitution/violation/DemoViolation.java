/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.solid.liskov.substitution.violation;

public class DemoViolation {

  static void useIt(Rectangle rectangle) {
    int width = rectangle.getWidth();
    rectangle.setHeight(10);

    System.out.println("Expect area of " + (width * 10) + ", got " + rectangle.getArea()) ;
  }

  public static void main(String[] args) {
    Rectangle rc = new Rectangle(2, 3);

    useIt(rc);

    Rectangle sq = new Square();
    sq.setWidth(5);

    useIt(sq);
  }
}

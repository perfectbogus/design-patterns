/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.item38.emulate.extensible.enums.with.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Demo {

  public static void main(String[] args) {
    List<Operation> operations = new ArrayList<>();

    BasicOperation basicOperation = BasicOperation.PLUS;
    ExtendedOperation extendedOperation = ExtendedOperation.EXP;

    operations.add(basicOperation);
    operations.add(extendedOperation);

    for (Operation op : operations) {
      System.out.println(op.apply(1, 2));
    }

    test(ExtendedOperation.class, Double.parseDouble("2"), Double.parseDouble("2"));

    test2(
        Arrays.asList(ExtendedOperation.values()),
        Double.parseDouble("2"),
        Double.parseDouble("2"));
  }


  private static <T extends Enum<T> & Operation> void test(Class<T> opEnumType, double x,
                                                           double y) {
    for (Operation op : opEnumType.getEnumConstants()) {
      System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x,y));
    }
  }

  private static void test2(Collection<? extends Operation> opSet, double x, double y) {
    for (Operation op : opSet) {
      System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x,y));
    }
  }
}

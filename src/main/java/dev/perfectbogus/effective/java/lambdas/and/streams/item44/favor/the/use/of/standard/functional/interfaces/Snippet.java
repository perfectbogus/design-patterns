/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.lambdas.and.streams.item44.favor.the.use.of.standard.functional.interfaces;

import jdk.incubator.vector.VectorOperators;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class Snippet {

  private Map<Integer, String> map = new HashMap<>();

  protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
    return map.size() > 100;
  }

  /**
   * If one of the standard functional interfaces does the job, you should generally use it
   * in preference to a purpose-built functional interface.
   *
   *  UnaryOperator<T>        T apply(T t)              String::toLowerCase
   *  BinaryOperator<T>       T apply(T t1, T t2)       BigInteger::add
   *  Predicate<T>            boolean test(T t)         Collection::isEmpty
   *  Function<T,R>           R apply(T t)              Arrays::asList
   *  Supplier<T>             T get()                   Instant::now
   *  Consumer<T>             void accept(T t)          System.out::println
   *
   */

  public static void main(String[] args) {
    // Main Functional Interface:
    UnaryOperator<String> unaryOperator;
    //Three Variants for each 6 main
    LongUnaryOperator longUnaryOperator;
    IntUnaryOperator intUnaryOperator;
    DoubleUnaryOperator doubleUnaryOperator;

    // Binary Functional Interface
    BinaryOperator<String> binaryOperator;
    // Variant:
    IntBinaryOperator intBinaryOperator;
    LongBinaryOperator longBinaryOperator;
    DoubleBinaryOperator doubleBinaryOperator;

    IntPredicate intPredicate;
    LongPredicate longPredicate;
    DoublePredicate doublePredicate;

    IntFunction<int[]> intFunction;
    LongFunction<int[]> longFunction;
    DoubleFunction<int[]> doubleFunction;

    IntSupplier intSupplier;
    DoubleSupplier doubleSupplier;
    LongSupplier longSupplier;

    IntConsumer intConsumer;
    DoubleConsumer doubleConsumer;
    LongConsumer longConsumer;

    // Function (Functional Interface) Variant
    // source and result types are primitive
    IntToDoubleFunction intToDoubleFunction;
    IntToLongFunction intToLongFunction;
    LongToIntFunction longToIntFunction;
    LongToDoubleFunction longToDoubleFunction;
    DoubleToIntFunction doubleToIntFunction;
    DoubleToLongFunction doubleToLongFunction;

    BiPredicate<String, Integer> biPredicate;
    BiFunction<String, Integer, Double> biFunction;
    BiConsumer<String, Integer> biConsumer;

    ToIntBiFunction<String, Double> toIntBiFunction;
    ToDoubleBiFunction<String, Integer> toDoubleBiFunction;
    ToLongBiFunction<String, Double> toLongBiFunction;

    ObjIntConsumer<String> objIntConsumer;
    ObjLongConsumer<String> objLongConsumer;
    ObjDoubleConsumer<String> objDoubleConsumer;

    BooleanSupplier booleanSupplier;


  }
}

/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.enums.item39.prefer.annotations.to.naming.patterns;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

public class RunTests {

  public static void main(String[] args) throws Exception {
    int tests = 0;
    int passed = 0;

    Class<?> testClass = Sample.class;

    for (Method m : testClass.getDeclaredMethods()) {
      if (m.isAnnotationPresent(Test.class)) {
        tests++;
        try {
          m.invoke(null);
          passed++;
        } catch (IllegalAccessException e) {
          System.out.println("Invalida @Test: " + m);
        } catch (Exception e) {
          Throwable exc = e.getCause();
          System.out.println(m + " failed: " + exc);
        }
      }
    }
    System.out.printf("Passed: %d, Failed: %d%n", passed, tests-passed);

    int tests2 = 0;
    int passed2 = 0;

    Class<?> testClass2 = Sample2.class;

    for (Method m : testClass2.getDeclaredMethods()) {
      if (m.isAnnotationPresent(ExceptionTest.class)) {
        tests2++;
        try {
          m.invoke(null);
          System.out.printf("Test %s failed: no exception %n", m);
        } catch (InvocationTargetException wrappedEx) {
          Throwable exc = wrappedEx.getCause();
          Class<? extends Throwable> excType = m.getAnnotation(ExceptionTest.class).value();
          if (excType.isInstance(exc)) {
            passed2++;
          } else {
            System.out.printf("Test %s failed: expected %s, got %s%n", m, excType.getName(), exc);
          }
        } catch (Exception e) {
          System.out.println(m + "Invalid @ExceptionTest: " + m);
        }
      }
    }
    System.out.printf("Passed: %d, Failed: %d%n", passed2, tests2-passed2);


    test3();
  }

  private static void test3() {
    int tests2 = 0;
    int passed2 = 0;

    Class<?> testClass2 = Sample3.class;

    for (Method m : testClass2.getDeclaredMethods()) {
      if (m.isAnnotationPresent(ExceptionTest.class)) {
        tests2++;
        try {
          m.invoke(null);
          System.out.printf("Test %s failed: no exception %n", m);
        } catch (Throwable wrappedEx) {
          Throwable exc = wrappedEx.getCause();
          int oldPassed = passed2;
          Class<? extends Throwable>[] excTypes = m.getAnnotation(MultipleExceptionTest.class).value();

          for (Class<? extends Throwable> excType : excTypes) {
            if (excType.isInstance(exc)) {
              passed2++;
              break;
            }
          }
          if (passed2 == oldPassed) {
            System.out.printf("Test %failed: %s %n", m, exc);
          }
        }
      }
    }
  }

}

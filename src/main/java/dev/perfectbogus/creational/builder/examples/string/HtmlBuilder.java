/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.creational.builder.examples.string;

public class HtmlBuilder {

  private String rootName;
  private HtmlElement root = new HtmlElement();

  public HtmlBuilder(String rootName) {
    this.rootName = rootName;
    root.name = rootName;
  }

  public void addChild(String childName, String childText) {
    HtmlElement e = new HtmlElement(childName, childText);
    root.elements.add(e);
  }

  public void clear() {
    root = new HtmlElement();
    root.name = rootName;
  }

  @Override
  public String toString() {
    return root.toString();
  }

}

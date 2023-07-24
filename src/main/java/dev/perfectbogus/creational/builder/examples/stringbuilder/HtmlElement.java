/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.creational.builder.examples.stringbuilder;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
public class HtmlElement {

  public String name, text;
  public ArrayList<HtmlElement> elements = new ArrayList<>();

  private final int indentSize = 2;
  private final String newLine = System.lineSeparator();


  public HtmlElement(String childName, String childText) {
      this.name = childName;
      this.text = childText;
  }
}

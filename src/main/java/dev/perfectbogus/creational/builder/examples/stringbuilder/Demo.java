/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.creational.builder.examples.stringbuilder;

public class Demo {

  public static void main(String[] args) {
    String str = "Hello";
    System.out.println("<p>" + str + "</p>");

    String[] words = {"hello", "World"};

    StringBuilder sb = new StringBuilder();
    sb.append("<ul>\n");
    for (String word : words) {
      sb.append(String.format(" <li>%s</li>\n", word));
    }
    sb.append("</ul>");

    System.out.println(sb);


    HtmlBuilder builder = new HtmlBuilder("ul");
    builder.addChild("li", "hell");
    builder.addChild("li", "worlds");
    System.out.println(builder);
  }

}

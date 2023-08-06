/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.lambdas.and.streams.item45.use.streams.judiciously;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class Anagrams {

  public static void main(String[] args) throws IOException {
    String[] data = {};
    //iterativeWay(data);
    //overUseStreams();
    //tastefulUseStreams();

    String word = "carter";

    System.out.println(
        word.chars().sorted().collect(
            StringBuilder::new,
            (stringBuilder, value) -> stringBuilder.append((char) value),
            StringBuilder::append
        ).toString()
    );
  }

  public static void tastefulUseStreams() throws IOException {
    String pathName = "/Users/joseescobar/Documents/projects/design-patterns/src/main/resources/item45/dict.txt";
    Path pathDict = Paths.get(pathName);
    int minGroupSize = 10;

    try (Stream<String> words = Files.lines(pathDict)) {
      words.collect(
          groupingBy(Anagrams::alphabetize)
      ).values().stream()
          .filter(group -> group.size() >= minGroupSize)
          .forEach(group -> System.out.println(group.size() + ": " + group));
    }
  }

  public static void overUseStreams() throws IOException {
    String pathName = "/Users/joseescobar/Documents/projects/design-patterns/src/main/resources/item45/dict.txt";

    Path pathDict = Paths.get(pathName);
    int minGroupSize = 10;

    try (Stream<String> words = Files.lines(pathDict)) {
      words.collect(
          groupingBy(word -> word.chars().sorted().collect(
                  StringBuilder::new, (sb, c) -> sb.append((char) c), StringBuilder::append
          ).toString())
      ).values().stream().filter(
          group -> group.size() >= minGroupSize
      ).map(group -> group.size() + ": " + group).forEach(System.out::println);
    }
  }

  public static void iterativeWay(String[] args) throws FileNotFoundException {
    String pathName = "/Users/joseescobar/Documents/projects/design-patterns/src/main/resources/item45/dict.txt";
    File dictionary = new File(pathName);
    int minGroupSize = 10;

    Map<String, Set<String>> groups = new HashMap<>();

    try (Scanner s = new Scanner(dictionary)) {
      while (s.hasNext()) {
        String word = s.next();
        groups.computeIfAbsent(alphabetize(word), (unused) -> new TreeSet<>()).add(word);
      }
    }

    for (Set<String> group : groups.values()) {
      if (group.size() >= minGroupSize) {
        System.out.println(group.size() + ": " + group);
      }
    }

  }

  private static String alphabetize(String word) {
    char[] a = word.toCharArray();
    Arrays.sort(a);
    return new String(a);
  }
}

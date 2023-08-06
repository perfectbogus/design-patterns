/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.lambdas.and.streams.item46.prefer.side.effect.free.functions.in.streams;

import dev.perfectbogus.effective.java.enums.item37.use.enummap.instead.of.ordinal.indexing.solution.Phase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class Snippet {
  public static void main(String[] args) throws FileNotFoundException {

    useStreamsButNotParadigm();
    useStreamWithParadigm();
    improveUseStreamsWithParadigm();
    makeAMapFromStringToEnum();

  }

  public static void generateAMapFromKey() {
    List<Album> albums = Arrays.asList(
        new Album("Mezmerrize", 100, new Artist("SOAD")),
        new Album("Toxicity", 101, new Artist("System"))
    );

//    Map<Artist, Album> topHits = albums.stream().collect(
//        toMap(AlbumMetadata::artist, a -> a , maxBy(comparing(AlbumMetadata::sales)))
//    );
  }

  public static void makeAMapFromStringToEnum() {
    Map<String, Phase> map = Stream.of(Phase.values())
        .collect(toMap(Objects::toString, e -> e));

    map.forEach((s, phase) -> System.out.println("(String) Key: " + s + "(Enum) Value: " + phase));
  }

  public static void useStreamsButNotParadigm() throws FileNotFoundException {
    //Use the streams API but not the paradigm - Don't do this!
    File file = new File("/Users/joseescobar/Documents/projects/design-patterns/src/main/resources/item45/dict.txt");
    Map<String, Long> freq = new HashMap<>();

    try (Stream<String> words = new Scanner(file).tokens()) {
      words.forEach(word -> {
        freq.merge(word.toLowerCase(), 1L, Long::sum);
      });
    }
  }

  public static void useStreamWithParadigm() throws FileNotFoundException {
    File file = new File("/Users/joseescobar/Documents/projects/design-patterns/src/main/resources/item45/dict.txt");
    Map<String, Long> freq = new HashMap<>();

    //Proper use of streams to initialize a frequency table
    Map<String, Long> frequency;
    try (Stream<String> words = new Scanner(file).tokens()) {
      frequency = words.collect(
          groupingBy(String::toLowerCase, counting())
      );
    }
  }

  public static void improveUseStreamsWithParadigm() throws FileNotFoundException {
    File file = new File("/Users/joseescobar/Documents/projects/design-patterns/src/main/resources/item45/dict.txt");

    Map<String, Long> frequency;
    try (Stream<String> words = new Scanner(file).tokens()) {
      frequency = words.collect(groupingBy(String::toLowerCase, counting()));

      List<String> topTen = frequency.keySet().stream().sorted(comparing(frequency::get).reversed()).limit(10).collect(toList());

      List<String> anotherTopTen = frequency.keySet().stream().sorted(comparing(frequency::get).reversed()).limit(10).toList();
    }
  }



}

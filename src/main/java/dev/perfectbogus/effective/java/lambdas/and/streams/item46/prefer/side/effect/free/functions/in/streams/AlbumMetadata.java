/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.effective.java.lambdas.and.streams.item46.prefer.side.effect.free.functions.in.streams;

public class AlbumMetadata {

  public static Artist artist(Album album) {
    return album.artist();
  }

  public static Album sales(Album albumA, Album albumB) {
    return albumA.sales() >= albumB.sales() ? albumA : albumB;
  }

}

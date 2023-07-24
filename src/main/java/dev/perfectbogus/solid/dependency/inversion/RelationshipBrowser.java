/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.solid.dependency.inversion;

import java.util.List;

public interface RelationshipBrowser {

  List<Person> findAllChildrenOf(String name);

}

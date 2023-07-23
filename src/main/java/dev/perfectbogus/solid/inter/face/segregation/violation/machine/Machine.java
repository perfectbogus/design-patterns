/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.solid.inter.face.segregation.violation.machine;

import dev.perfectbogus.solid.inter.face.segregation.violation.Document;

public interface Machine {
  void print(Document document);

  void fax(Document document);

  void scan(Document document);

}

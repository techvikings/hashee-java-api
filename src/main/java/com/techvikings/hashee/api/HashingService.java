package com.techvikings.hashee.api;

import java.io.InputStream;

public interface HashingService {
  boolean available();

  String name();

  int length();

  Hash hash(InputStream inputStream);
}

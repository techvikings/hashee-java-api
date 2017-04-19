package com.techvikings.hashee.api.impl;

import com.techvikings.hashee.api.Hash;

public class SimpleHash implements Hash {
  public byte[] hash;

  @Override
  public byte[] asBytes() {
    return hash;
  }
}

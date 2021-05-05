package com.github.uskrai.pbominggu10.factorymethod.makanan;

public class MakananFactory {

  public static Makanan newMakanan(JenisMakanan jenisMakanan) {
    switch (jenisMakanan) {
      case BAKSO:
        return new Bakso();
      case GORENGAN:
        return new Gorengan();
      default:
        return null;
    }
  }

}

package com.github.uskrai.pbominggu10.abstractfactory.minuman;

public class EsBuah implements Minuman {
  public static final String namaMinuman = EsBuah.class.getSimpleName();
  @Override
  public void rasa() {
    System.out.println(namaMinuman+": Rasanya manis, tapi segerrr");
  }
}

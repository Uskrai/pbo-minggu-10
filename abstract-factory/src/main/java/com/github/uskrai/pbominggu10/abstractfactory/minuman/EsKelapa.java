package com.github.uskrai.pbominggu10.abstractfactory.minuman;

public class EsKelapa implements Minuman{
  public static final String namaMinuman = EsKelapa.class.getSimpleName();
  @Override
  public void rasa() {
    System.out.println(namaMinuman+": Rasanya hambar, tapi cocok disajikan saat makan");
  }
}

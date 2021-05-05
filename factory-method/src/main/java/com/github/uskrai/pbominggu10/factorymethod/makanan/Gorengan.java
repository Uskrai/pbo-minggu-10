package com.github.uskrai.pbominggu10.factorymethod.makanan;

public class Gorengan implements Makanan {
  private String namaMakanan = Gorengan.class.getSimpleName();

  @Override
  public void rasa() {
    System.out.println(namaMakanan + " : Rasanya sangat gurih dan renyah menjadikan makanan incaran pada saat buka puasa");
  }
}
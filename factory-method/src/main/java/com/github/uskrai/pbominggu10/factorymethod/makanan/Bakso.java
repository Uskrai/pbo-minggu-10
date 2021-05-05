package com.github.uskrai.pbominggu10.factorymethod.makanan;

public class Bakso implements Makanan {
  private String namaMakanan = Bakso.class.getSimpleName();

  @Override
  public void rasa() {
    System.out.println(namaMakanan + " : Rasa kuah dan daging yang kenyal menjadikan makanan favorite orang Indonesia");
  }
}
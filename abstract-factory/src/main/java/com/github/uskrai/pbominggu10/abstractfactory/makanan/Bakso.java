package com.github.uskrai.pbominggu10.abstractfactory.makanan;

public class Bakso implements Makanan {
  private String namaMakanan = Bakso.class.getSimpleName();

  @Override
  public void harga() {
    System.out.println(namaMakanan+": Harganya 10.000");
  }

}
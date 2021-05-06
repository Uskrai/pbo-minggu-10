package com.github.uskrai.pbominggu10.abstractfactory.makanan;

public class Gorengan implements Makanan {
  public static final String namaMakanan = Gorengan.class.getSimpleName();

  @Override
  public void harga() {
    System.out.println(namaMakanan+": Harganya 1.000");
  }
}
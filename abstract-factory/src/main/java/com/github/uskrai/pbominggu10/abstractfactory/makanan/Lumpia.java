package com.github.uskrai.pbominggu10.abstractfactory.makanan;

public class Lumpia implements Makanan {
    private static final String namaMakanan = Lumpia.class.getSimpleName();

    @Override
    public void harga() {
        System.out.println(namaMakanan+": Harganya 2.000");
    }

}
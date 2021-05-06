package com.github.uskrai.pbominggu10.abstractfactory;

import com.github.uskrai.pbominggu10.abstractfactory.makanan.JenisMakanan;
import com.github.uskrai.pbominggu10.abstractfactory.makanan.Makanan;
import com.github.uskrai.pbominggu10.abstractfactory.minuman.JenisMinuman;
import com.github.uskrai.pbominggu10.abstractfactory.minuman.Minuman;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    AbstractFactory factory = FactoryProduksi.getFactory(FactoryProduksi.PILIH_MAKANAN);

    Makanan order1 = factory.getMakanan(JenisMakanan.BAKSO.name());
    order1.harga();

    Makanan order2 = factory.getMakanan(JenisMakanan.LUMPIA.name());
    order2.harga();

    Makanan order3 = factory.getMakanan(JenisMakanan.GORENGAN.name());
    order3.harga();

    factory = FactoryProduksi.getFactory(FactoryProduksi.PILIH_MINUMAN);

    Minuman order4 = factory.getMinuman(JenisMinuman.ES_BUAH.name());
    order4.rasa();

    Minuman order5 = factory.getMinuman(JenisMinuman.ES_KELAPA.name());
    order5.rasa();

    Minuman order6 = factory.getMinuman(JenisMinuman.KOLAK.name());
    order6.rasa();

  }
}

package com.github.uskrai.pbominggu10.abstractfactory;

import com.github.uskrai.pbominggu10.abstractfactory.makanan.MakananFactory;
import com.github.uskrai.pbominggu10.abstractfactory.minuman.MinumanFactory;

public class FactoryProduksi {
    public static final String PILIH_MAKANAN = "Memilih Makanan";
    public static final String PILIH_MINUMAN = "Menimilih Minuman";

public static AbstractFactory getFactory(String pilihan) {
    if(pilihan.equals(PILIH_MAKANAN)){
        return new MakananFactory();
    }
    else if (pilihan.equals(PILIH_MINUMAN)){
        return new MinumanFactory();
    }
    return null;
}
}

package com.github.uskrai.pbominggu10.abstractfactory.minuman;

import com.github.uskrai.pbominggu10.abstractfactory.AbstractFactory;
import com.github.uskrai.pbominggu10.abstractfactory.makanan.Makanan;

public class MinumanFactory implements AbstractFactory {

    @Override
    public Minuman getMinuman(String minuman) {
        if (minuman.equals(JenisMinuman.KOLAK.name())){
            return new Kolak();
        }
        else if (minuman.equals(JenisMinuman.ES_BUAH.name())){
            return new EsBuah();
        }
        else if (minuman.equals(JenisMinuman.ES_KELAPA.name())){
            return new EsKelapa();
        }
        return null;
    }

    @Override
    public Makanan getMakanan(String makanan) {
        return null;
    }    
}

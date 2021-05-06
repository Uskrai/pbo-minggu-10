package com.github.uskrai.pbominggu10.abstractfactory.Minumann;

public class MinumanFactory extends AbstractFactory {

    @Override
    Minuman getMinuman(String minuman) {
        if (minuman.equals(JenisMinuman.Kolak)){
            return new Kolak();
        }
        else if (minuman.equals(JenisMinuman.EsBuah)){
            return new EsBuah();
        }
        else if (minuman.equals(JenisMinuman.EsKelapa)){
            return new EsKelapa();
        }
        return null;
    }

    @Override
    Makanan getMakanan(String makanan) {
        return null;
    }    
}

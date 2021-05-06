package com.github.uskrai.pbominggu10.abstractfactory.Makanan;

public class MakananFactory extends AbstractFactory {

    @Override
    Makanan getMakanan(String makanan){

        if (makanan.equals(JenisMakanan.Bakso)){
            return new Bakso();
        }
        else if (makanan.equals(JenisMakanan.Gorengan)){
            return new Gorengan();
        }
        else if (makanan.equals(JenisMakanan.Lumpia)){
            return new Lumpia();
        }
        return null;
    }

    @Override
    Minuman getMinuman(String minuman) {
        return null;
    }
}
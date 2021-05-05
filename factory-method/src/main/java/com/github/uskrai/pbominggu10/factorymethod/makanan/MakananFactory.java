package com.github.uskrai.pbominggu10.factorymethod.makanan;

public class MakananFactory {

    public static Makanan newMakanan(JenisMakanan jenisMakanan) {
        // if else here
        if ( jenisMakanan == JenisMakanan.BAKSO )
            return new Bakso();
        if ( jenisMakanan == JenisMakanan.GORENGAN)
            return new Gorengan();

        return null;
    }

}

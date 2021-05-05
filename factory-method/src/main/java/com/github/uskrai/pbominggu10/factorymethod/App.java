package com.github.uskrai.pbominggu10.factorymethod;

import com.github.uskrai.pbominggu10.factorymethod.makanan.JenisMakanan;
import com.github.uskrai.pbominggu10.factorymethod.makanan.Makanan;
import com.github.uskrai.pbominggu10.factorymethod.makanan.MakananFactory;

public class App
{
    public static void main( String[] args )
    {
        Makanan order = MakananFactory.newMakanan(JenisMakanan.BAKSO);
        if ( order != null )
            order.rasa();

        order = MakananFactory.newMakanan(JenisMakanan.GORENGAN);
        if ( order != null )
            order.rasa();
    }
}

package com.github.uskrai.pbominggu10.abstractfactory.Minuman;

public class Kolak implements Minuman {
    private String namaMinuman = Kolak.class.getSimpleName();

    @Override
    public void rasa(){
        System.out.println(namaMinuman+" : Rasanya manis")
    }
}
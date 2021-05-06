package com.github.uskrai.pbominggu10.abstractfactory;

public abstract class AbstractFactory<Makanan, Minuman> {
    
    abstract Makanan getMakanan(String makanan);
    abstract Minuman getMinuman(String minuman);
    
}
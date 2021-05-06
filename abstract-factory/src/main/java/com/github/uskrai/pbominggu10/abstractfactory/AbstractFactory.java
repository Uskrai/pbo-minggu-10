package com.github.uskrai.pbominggu10.abstractfactory;

import com.github.uskrai.pbominggu10.abstractfactory.makanan.Makanan;
import com.github.uskrai.pbominggu10.abstractfactory.minuman.Minuman;

public interface AbstractFactory {
    
    Makanan getMakanan(String makanan);
    Minuman getMinuman(String minuman);
    
}

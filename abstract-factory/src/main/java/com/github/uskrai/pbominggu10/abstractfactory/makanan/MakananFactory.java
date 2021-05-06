package com.github.uskrai.pbominggu10.abstractfactory.makanan;

import com.github.uskrai.pbominggu10.abstractfactory.AbstractFactory;
import com.github.uskrai.pbominggu10.abstractfactory.minuman.JenisMinuman;
import com.github.uskrai.pbominggu10.abstractfactory.minuman.Minuman;

public class MakananFactory implements AbstractFactory {
  @Override
  public Makanan getMakanan(String makanan) {
    if (makanan.equals(JenisMakanan.BAKSO.name())) {
      return new Bakso();
    } else if (makanan.equals(JenisMakanan.GORENGAN.name())) {
      return new Gorengan();
    } else if (makanan.equals(JenisMakanan.LUMPIA.name())) {
      return new Lumpia();
    }
    return null;
  }

  @Override
  public Minuman getMinuman(String minuman) {
    return null;
  }
}
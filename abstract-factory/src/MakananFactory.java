package PBO_Tugas;

public class MakananFactory extends AbstractFactory {
    @Override
    Makanan getMakanan (String makanan){
        if(makanan.equals(JenisMakanan.NASI_GORENG)){
            return new NasiGoreng();
        }
        else if(makanan.equals(JenisMakanan.NASI_UDUK)){
            return new NasiUduk();
        }
        else if(makanan.equals(JenisMakanan.NASI_PADANG)){
            return new NasiPadang();
        }
        return null;
    }
    @Override
    Minuman getMinuman(String minuman) {
        return null;
    }
}

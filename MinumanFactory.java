package PBO_Tugas;

public class MinumanFactory extends AbstractFactory{
    @Override
    Minuman getMinuman (String minuman){
        if(minuman.equals(JenisMinuman.TEH_HIJAU)){
            return new TehHijau();
        }
        else if(minuman.equals(JenisMinuman.TEH_MANIS)){
            return new TehManis();
        }
        else if(minuman.equals(JenisMinuman.TEH_TAWAR)){
            return new TehTawar();
        }
        return null;
    }
    @Override
    Makanan getMakanan(String makanan){
        return null;
    }
}

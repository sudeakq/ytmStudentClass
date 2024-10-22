import java.util.ArrayList;
import java.util.List;

abstract class Ders {

    protected String dersAdi;
    protected String dersKodu;
    protected String donem;
    protected boolean secmeli;
    protected int kredi;
    protected Akademisyen dersSorumlusu;
    private List<Ogrenci> ogrenciListesi;

    public Ders(String dersAdi, String dersKodu, String donem,Akademisyen  dersSorumlusu,int kredi ){
        this.dersAdi = dersAdi;
        this.dersKodu = dersKodu;
        this.donem = donem;
        this.dersSorumlusu = dersSorumlusu;
        this.kredi = kredi;
        ogrenciListesi = new ArrayList<>();

    }

    public abstract String notHesapla(double... notlar);

    public void derseYazilim(Ogrenci ogrenci) {
        ogrenciListesi.add(ogrenci);
    }

    public boolean ogrenciKayitlimi(int numara) {
        for (Ogrenci ogrenci : ogrenciListesi) {
            if (ogrenci.getNumara() == numara) {
                return true;
            }
        }
        return false;
    }

    public void listeyiYazdir() {
        System.out.println(dersAdi + " Öğrenci Listesi:");
        for (Ogrenci ogrenci : ogrenciListesi) {
            System.out.println(ogrenci.getAdSoyad());
        }
    }

    protected String harfNotu(double ortalama){
        if(ortalama>=90){
            return "AA";
        }
        else if(ortalama>=80){
            return "BA";
        }
        else if(ortalama>=70){
            return "BB";
        }
        else if(ortalama>=60){
            return "CB";
        }
        else if(ortalama>=50){
            return "CC";
        }
        else if(ortalama>=40){
            return "DC";
        }
        else if(ortalama>=30){
            return "DD";
        }
        else{
            return "FF";
        }
    }

}

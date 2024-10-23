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
    private String dersHarfNotu;

    public Ders(String dersAdi, String dersKodu, String donem, Akademisyen dersSorumlusu, int kredi) {
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

    public String getDersHarfNotu() {
        return dersHarfNotu;
    }

    public void setDersHarfNotu(String dersHarfNotu) {
        this.dersHarfNotu = dersHarfNotu;
    }

    protected String harfNotu(double ortalama) {
        int yuvarlanmisOrtalama = (int) ortalama / 10;

        switch (yuvarlanmisOrtalama) {
            case 10:
            case 9:
                return "AA";
            case 8:
                return "BA";
            case 7:
                return "BB";
            case 6:
                return "CB";
            case 5:
                return "CC";
            case 4:
                return "DC";
            case 3:
                return "DD";
            default:
                return "FF";
        }
    }

}

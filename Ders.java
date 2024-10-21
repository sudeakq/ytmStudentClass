import java.util.ArrayList;
import java.util.List;

// Abstract Ders sınıfı
abstract class Ders {
    protected String dersAdi;
    protected String dersKodu;
    protected String donem;
    protected boolean secmeli;
    protected Akademisyen dersSorumlusu;
    protected int kredi;
    private List<Ogrenci> ogrenciListesi;

    // Constructor
    public Ders(String dersAdi, String dersKodu, String donem, boolean secmeli, Akademisyen dersSorumlusu, int kredi) {
        this.dersAdi = dersAdi;
        this.dersKodu = dersKodu;
        this.donem = donem;
        this.secmeli = secmeli;
        this.dersSorumlusu = dersSorumlusu;
        this.kredi = kredi;
        ogrenciListesi = new ArrayList<>();
    }

    // Abstract metod, her ders için farklı not hesaplama algoritması olabilir
    public abstract String notHesapla(double... notlar);

    // Öğrenci derse yazılır
    public void derseYazilim(Ogrenci ogrenci) {
        ogrenciListesi.add(ogrenci);
    }

    // Öğrencinin derse kayıtlı olup olmadığını kontrol eder
    public boolean ogrenciKayitliMi(int numara) {
        for (Ogrenci ogrenci : ogrenciListesi) {
            if (ogrenci.getNumara() == numara) {
                return true;
            }
        }
        return false;
    }

    // Derse kayıtlı öğrenci listesini yazdırır
    public void listeyiYazdir() {
        System.out.println(dersAdi + " Öğrenci Listesi:");
        for (Ogrenci ogrenci : ogrenciListesi) {
            System.out.println(ogrenci.getAdSoyad());
        }
    }

    // Ders bilgilerini string olarak döndürür
    @Override
    public String toString() {
        return "Ders: " + dersAdi + ", Kod: " + dersKodu + ", Dönem: " + donem +
                ", Seçmeli: " + (secmeli ? "Evet" : "Hayır") + 
                ", Sorumlu: " + dersSorumlusu + ", Kredi: " + kredi;
    }

    // Ortalama nota göre harf notunu hesaplar
    protected String harfNotu(double ortalama) {
        if (ortalama >= 90)
            return "AA";
        else if (ortalama >= 80)
            return "BA";
        else if (ortalama >= 70)
            return "BB";
        else if (ortalama >= 60)
            return "CB";
        else if (ortalama >= 50)
            return "CC";
        else if (ortalama >= 40)
            return "DC";
        else if (ortalama >= 30)
            return "DD";
        else
            return "FF";
    }
}

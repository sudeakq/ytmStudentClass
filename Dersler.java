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

    // Abstract metod: Her dersin not hesaplama şekli farklı olabilir
    public abstract String notHesapla(double... notlar);

    // Öğrenciyi derse yazan metod
    public void derseYazilim(Ogrenci ogrenci) {
        ogrenciListesi.add(ogrenci);
    }

    // Diğer metodlar gerektiğinde buraya eklenebilir
}

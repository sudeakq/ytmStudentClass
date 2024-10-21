public class Ogrenci {
    private String ad;
    private String soyad;
    private int numara;
    private String bolum;
    private String fakulte;
    private int girisYili;
    private int sinif;

    // Constructor
    public Ogrenci(String ad, String soyad, int numara, String bolum, String fakulte, int girisYili, int sinif) {
        this.ad = ad;
        this.soyad = soyad;
        this.numara = numara;
        this.bolum = bolum;
        this.fakulte = fakulte;
        this.girisYili = girisYili;
        this.sinif = sinif;
    }

    // Getter metotları
    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getNumara() {
        return numara;
    }

    public String getBolum() {
        return bolum;
    }

    public String getFakulte() {
        return fakulte;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public int getSinif() {
        return sinif;
    }

    // Öğrencinin ad ve soyadını döndüren metot
    public String getAdSoyad() {
        return getAd() + " " + getSoyad();
    }
}

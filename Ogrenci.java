public class Ogrenci {
    private final String ad;
    private final String soyad;
    private final int numara;
    private final String bolum;
    private final String fakulte;
    private final int girisyili;
    private final int sinif;

    // Yapıcı metodun adı sınıf adıyla aynı olmalıdır
    public Ogrenci(String ad, String soyad, int numara, String bolum, String fakulte, int girisyili, int sinif){
        this.ad = ad;
        this.soyad = soyad;
        this.numara = numara;
        this.bolum = bolum;
        this.fakulte = fakulte;
        this.girisyili = girisyili;
        this.sinif = sinif;
    }

    // Getter metodları
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

    public int getGirisyili() {
        return girisyili;
    }

    public int getSinif() {
        return sinif;
    }
}

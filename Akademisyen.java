public class Akademisyen {
    private String ad;
    private String soyad;

    public Akademisyen(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    @Override
    public String toString() {
        return ad + " " + soyad;
    }
}

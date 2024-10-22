
class TemelDers extends Ders {

    public TemelDers(String dersAdi, String dersKodu, String donem, Akademisyen dersSorumlusu, int kredi) {
        super(dersAdi, dersKodu, donem, dersSorumlusu, kredi);
    }

    @Override
    public String notHesapla(double... notlar) {
        if (notlar.length != 3) {
            throw new IllegalArgumentException("Temel dersler için 3 not girilmelidir (Vize, Final, Proje).");
        }
        double ortalama = (notlar[0] * 0.3) + (notlar[1] * 0.2) + (notlar[2] * 0.5);
        return super.harfNotu(ortalama);
    }

}

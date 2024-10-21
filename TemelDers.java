class TemelDers extends Ders {

    // Constructor: Temel dersi oluşturur
    public TemelDers(String dersAdi, String dersKodu, String donem, boolean secmeli, Akademisyen dersSorumlusu, int kredi) {
        super(dersAdi, dersKodu, donem, secmeli, dersSorumlusu, kredi);
    }

    // Not hesaplama metodunu override eder
    @Override
    public String notHesapla(double... notlar) {
        // Temel dersler için 3 not (Vize, Final, Proje) girilmesi gerekiyor
        if (notlar.length != 3) {
            throw new IllegalArgumentException("Temel dersler için 3 not girilmelidir (Vize, Final, Proje).");
        }

        // Ortalama hesaplama: Vize %30, Final %50, Proje %20
        double ortalama = (notlar[0] * 0.3) + (notlar[1] * 0.5) + (notlar[2] * 0.2);
        // Ortalama harf notuna dönüştürülür
        return super.harfNotu(ortalama);
    }
}

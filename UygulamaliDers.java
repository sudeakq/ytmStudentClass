class UygulamaliDers extends Ders {

    // Constructor: Uygulamalı dersi oluşturur
    public UygulamaliDers(String dersAdi, String dersKodu, String donem, boolean secmeli, Akademisyen dersSorumlusu, int kredi) {
        super(dersAdi, dersKodu, donem, secmeli, dersSorumlusu, kredi);
    }

    // Not hesaplama metodunu override eder
    @Override
    public String notHesapla(double... notlar) {
        // Uygulamalı dersler için 2 not (Vize, Final) girilmesi gerekiyor
        if (notlar.length != 2) {
            throw new IllegalArgumentException("Uygulamalı dersler için 2 not girilmelidir (Vize, Final).");
        }

        // Ortalama hesaplama: Vize %40, Final %60
        double ortalama = (notlar[0] * 0.4) + (notlar[1] * 0.6);
        // Ortalama harf notuna dönüştürülür
        return super.harfNotu(ortalama);
    }
}

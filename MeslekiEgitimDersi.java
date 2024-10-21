class MeslekiEğitimDersi extends Ders {
    // Constructor: Mesleki eğitim dersini oluşturuyor
    public MeslekiEğitimDersi(String dersAdi, String dersKodu, String donem, boolean secmeli, Akademisyen dersSorumlusu, int kredi) {
        super(dersAdi, dersKodu, donem, secmeli, dersSorumlusu, kredi);
    }

    // Mesleki eğitim dersleri için not hesaplama metodunu override ediyor
    @Override
    public String notHesapla(double... notlar) {
        // Mesleki eğitim dersleri için sadece 1 not girilmesi gerekiyor
        if (notlar.length != 1) {
            throw new IllegalArgumentException("Mesleki eğitim dersleri için 1 not girilmelidir.");
        }
        // Verilen notu harf notuna çeviriyor
        return super.harfNotu(notlar[0]);
    }
}

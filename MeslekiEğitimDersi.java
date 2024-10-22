
class MeslekiEğitimDersi extends Ders {

    public MeslekiEğitimDersi(String dersAdi, String dersKodu, String donem, Akademisyen dersSorumlusu, int kredi) {
        super(dersAdi, dersKodu, donem, dersSorumlusu, kredi);
    }

    @Override
    public String notHesapla(double... notlar) {
        if (notlar.length != 1) {
            throw new IllegalArgumentException("Mesleki eğitim  dersleri için 1 not girilmelidir");
        }
        return super.harfNotu(notlar[0]);
    }
}

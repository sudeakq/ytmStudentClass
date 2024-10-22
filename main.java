
public class Main {

    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Yusuf", "KURT", 427634, "Yazilim", "Of", 2022, 3);
        Ogrenci ogrenci2 = new Ogrenci("Hüseyin", "KURT", 427646, "Yazilim", "Of", 2022, 3);

        Akademisyen akademisyen1 = new Akademisyen("Can", "Bozok");
        Akademisyen akademisyen2 = new Akademisyen("Dağra", "Solmaz");

        TemelDers ders1 = new TemelDers("Matematik", "123", "2", akademisyen1, 4);
        UygulamaliDers lab1 = new UygulamaliDers("YTM", "301", "Güz", akademisyen2, 3);

        BilgiPaketi bilgiPaketi1 = new BilgiPaketi();

        ders1.derseYazilim(ogrenci1);

        bilgiPaketi1.dersEkle(ders1);

        bilgiPaketi1.TranskriptSorgula(ogrenci1);

    }

}

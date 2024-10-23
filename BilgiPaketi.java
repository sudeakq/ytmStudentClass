
import java.util.ArrayList;
import java.util.List;

public class BilgiPaketi {

    private final List<Ders> tumDersler;

    public BilgiPaketi() {
        tumDersler = new ArrayList<>();
    }

    public void dersEkle(Ders ders) {
        tumDersler.add(ders);
    }

    public void TranskriptSorgula(Ogrenci ogrenci) {
        for (Ders ders : tumDersler) {
            if (ders.ogrenciKayitlimi(ogrenci.getNumara())) {
                System.out.print(ders.dersAdi + " adli dersin kredisi " + ders.kredi + " harf notu " + ders.getDersHarfNotu());
            }
        }
    }
}

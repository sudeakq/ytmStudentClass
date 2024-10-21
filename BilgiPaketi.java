import java.util.ArrayList;
import java.util.List;

public class BilgiPaketi {
    private List<Ders> tumDersler;

    // Constructor: BilgiPaketi nesnesi oluşturulduğunda dersler listesi başlatılıyor
    public BilgiPaketi() {
        tumDersler = new ArrayList<>();
    }

    // Bir ders eklemek için kullanılan metod
    public void dersEkle(Ders ders) {
        tumDersler.add(ders);
    }

    // Bir öğrencinin transkriptini sorgulamak için kullanılan metod
    public void transkriptSorgula(Ogrenci ogrenci) {
        System.out.println(ogrenci.getAdSoyad() + " Ders Listesi:");
        
        // Derslerin arasında gezip öğrenci kayıtlı mı kontrol ediyoruz
        for (Ders ders : tumDersler) {
            if (ders.ogrenciKayitliMi(ogrenci.getNumara())) {
                // Ders adı, kredisi ve harf notu yazdırılıyor
                System.out.print(ders.getDersAdi() + " dersi ");
                System.out.print("kredisi " + ders.getKredi() + " ");
                System.out.println("harf notu " + ders.harfNotu(ogrenci.getNumara()));
            }
        }
    }
}

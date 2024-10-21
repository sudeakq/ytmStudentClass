class Main {
    public static void main(String[] args) {
        // Öğrenci nesneleri oluşturuluyor
        Ogrenci ogrenci1 = new Ogrenci("Ali 1", "Veli", 1, "Yazilim", "Teknoloji", 2024, 1);
        Ogrenci ogrenci2 = new Ogrenci("Ali 2", "Veli", 2, "Yazilim", "Teknoloji", 2024, 1);
        Ogrenci ogrenci3 = new Ogrenci("Ali 3", "Veli", 3, "Yazilim", "Teknoloji", 2024, 1);
        
        // Akademisyen nesneleri oluşturuluyor
        Akademisyen akademisyen1 = new Akademisyen("Ad 1", "Soyad 1");
        Akademisyen akademisyen2 = new Akademisyen("Ad 2", "Soyad 2");
        
        // BilgiPaketi nesnesi oluşturuluyor
        BilgiPaketi bilgiPaketi = new BilgiPaketi();
        
        // Ders ve laboratuvar nesneleri oluşturuluyor
        TemelDers ders1 = new TemelDers("Matematik", "101", "Güz", false, akademisyen1, 2);
        UygulamaliDers lab1 = new UygulamaliDers("YTM", "301", "Güz", false, akademisyen2, 3);
        
        // Dersler bilgi paketine ekleniyor
        bilgiPaketi.dersEkle(ders1);
        bilgiPaketi.dersEkle(lab1);
        
        // Öğrenciler derse yazılıyor
        ders1.derseYazilim(ogrenci1);
        ders1.derseYazilim(ogrenci2);
        ders1.derseYazilim(ogrenci3);
        lab1.derseYazilim(ogrenci1);
        lab1.derseYazilim(ogrenci3);
        
        // Derslerdeki öğrenci listeleri yazdırılıyor
        ders1.listeyiYazdir();
        lab1.listeyiYazdir();
        
        // Öğrencilerin transkript sorgulamaları yapılıyor
        bilgiPaketi.transkriptSorgula(ogrenci1);
        bilgiPaketi.transkriptSorgula(ogrenci2);
    }
}

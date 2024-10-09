    abstract class Ders{
       protected String dersAdi;
       protected String dersKodu;
       protected String donem;
       protected Boolean secmeli;
       protected Akademisyen dersSorumlusu;
       protected int kredi;
       private ListOgrenci> ogrenciListesi;

public Ders(String dersAdi, String dersKodu, String donem, Boolean secmeli, ){
    this.dersAdi=dersAdi;
    this.dersKodu=dersKodu;
    this.donem=donem;
    this.secmeli=secmeli;
    this.dersSorumlusu=dersSorumlusu;
    this.kredi=kredi;
    ogrenciListesi=new ArrayList<>();
}

public abstract String notHesapla (double..notlar){
    public void derseYazilim(Ogrenci ogrenci){
        ogrenciListesi.add(ogrenci);
    }
}
public boolean ogrenciKayitliMi(int numara){
    for(Ogrenci ogrenci :ogrenciListesi){
        if(ogrenci.getNumara()==numara)
        return true;
    }
    return false;
}
public void listeyiYazdir(){
 System.out.println(dersAdi + "Ogrenci Listesi:");
 for(Ogrenci ogrenci : ogrenciListesi){
    System.out.println(ogrenci.getSoyad());
 }
}
protected String harfNotu(double ortalama){
    int yuvarlanmisOrtalama = (int) Math.floor(ortalama);
    switch(yuvarlanmisOrtalama/10){
        case 10:
        case 9:
        return "AA";
        case 8:
        return "BA";
        case 7:
        return "BB";
        case 6:
        return "CB";
        case 5:
        return "CC";
        case 4:
        return "DC";
        case 3:
        return "DD";
        default:
        return "FF";
    }
}



      }


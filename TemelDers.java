public class TemelDers extends Ders{
    public TemelDers(String dersAdi, String dersKodu,String donem, boolean secmeli, Akademisyen dersSorumlusu, int kredi){
        super(dersAdi,dersKodu,donem,secmeli,dersSorumlusu,kredi);
    }
    @Override
    public String notHesapla(double...notlar){
        if(notlar.length!=3)(
            throw new IllegalArgumentException("Temel dersler için not girilmelidir.")
        )
    }
}

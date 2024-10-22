public class Akademisyen {
    private String akademisyenAd;
    private String akademisyenSoyad;


    public Akademisyen(String akademisyenAd, String akademisyenSoyad){
        this.akademisyenAd=akademisyenAd;
        this.akademisyenSoyad=akademisyenSoyad;
    }

    public String getAd(){
        return  akademisyenAd;
    }

    public String getSoyad(){
        return  akademisyenSoyad;
    }
}

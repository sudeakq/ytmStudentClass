public class main {
    public static void main(String[] args){
        Ogrenci ogr = new Ogrenci("Sude", "Akgun", 416651, "Yazılım Mühendisliği", "Of Teknoloji Fakültesi", 2022, 3);  
        System.out.println(ogr.getAd() + " " + ogr.getSoyad() + " " + ogr.getNumara() + " " + ogr.getBolum() + " " + ogr.getFakulte() + " " + ogr.getGirisyili() + " " + ogr.getSinif());
    }
}

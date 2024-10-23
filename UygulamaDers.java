class UygulamaliDers extends Ders {

        public UygulamaliDers(String dersAdi, String dersKodu, String donem, Akademisyen dersSorumlusu, int kredi) {
            super(dersAdi, dersKodu, donem, dersSorumlusu, kredi);
        }

        @Override
        public String notHesapla(double... notlar) {
            if (notlar.length != 2) {
                throw new IllegalArgumentException("Uygulamalı dersler için 2 not girilmelidir (Vize, Final)");
            }
            double ortalama = (notlar[0] * 0.4) + (notlar[1] * 0.6);
            setDersHarfNotu(super.harfNotu(ortalama));
            return super.harfNotu(ortalama);
        }
    }


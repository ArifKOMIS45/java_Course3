package gun34._01_soru;

public class Ders {
    String dersAd;
    int saati;


    public static Ders dersOlustur(String dersAd,int saati){

        Ders ders=new Ders();
        ders.dersAd=dersAd;
        ders.saati=saati;

        return ders;
    }


}

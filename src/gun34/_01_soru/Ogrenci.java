package gun34._01_soru;

import java.util.ArrayList;

public class Ogrenci {
    ArrayList<Ders> dersleri=new ArrayList<>();
    String isim;
    int MaxDersSaati;



    public static int getToplamKredi(ArrayList<Ders> dersleri)
    {    int toplam=0;
        for (Ders d: dersleri) {
            toplam+=d.saati;

        }return toplam;
    }
    public static void dersEkle(ArrayList<Ders> dersleri,Ders ders,int MaxDersSaati)
    {if (getToplamKredi(dersleri)+ders.saati<=MaxDersSaati)
    { dersleri.add(ders);}
    else System.out.println(ders.dersAd+ "Sinir asildi");
    }


    public static Ogrenci ogrenciOlustur(String ogrAd,int Maxsaati){

        Ogrenci ogr=new Ogrenci();
        ogr.isim=ogrAd;
        ogr.MaxDersSaati=Maxsaati;

        return ogr; }

    public static void dersYazdir(ArrayList<Ders> dersleri)
    {
        System.out.println("*************Aldigi dersler************");
        for (Ders ders:dersleri) {
            System.out.println(ders.dersAd+" " +ders.saati);
        }}


}
package gun31;

public class _05_javaClassAndObject {
    public static void main(String[] args) {
//calisan yer
        int sayi;// bir tanimlamayi boyle yapiyorduk

        //1.nesne olusturma;asamali
        Araba seninAraba;//fabrikaya sparis veiyorsunuz,uretilecek arabaya sizin adiniz veriiyor,ortada bir araba yok
        seninAraba = new Araba();//uretilmis oldu,artik meydanda,kullanilabilir

        //tek islemde tanimlama ve olusturma
        Araba benimArabam = new Araba();//Araba cinsinden yeni bir araba olustur,baslangic degerleri ile bir araba uretilmis
        //insan turunden yeni bir insan olusur adi arif gibi

        benimArabam.renk = "kirmizi";
        benimArabam.motorHacmi = 1600;
        benimArabam.yil = 1999;

        seninAraba.renk = "siyah";
        seninAraba.yil = 2020;
        seninAraba.motorHacmi = 2000;

        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.yil = " + benimArabam.yil);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);
        System.out.println("------------------------");


    }

    //metodun yazildigi yer
}
//1.yontem

class Araba {//BU tasarima class diyoruz
    //ozellikleri ve metodlari vardir
    String renk;
    int yil;
    double motorHacmi;
}
package gun32;

import java.util.HashSet;

public class _02_mentor {
    public static void main(String[] args) {
        /*
    mainClass method altinda bir double hashSet olusturunuz.

    ve bu seti, adi setOlustur ve return tipi hashSet double olan,

    ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.

    adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul edecek ayri bir method olusturarak

    hashSetin degerlerinin toplamini alınız.    ListOf'la da yapılabilir.
     */


        HashSet<Double> hashSet=setOlustur();
        System.out.println(hashSet);

        toplamaniAl(hashSet);


    }

    public static void  toplamaniAl(HashSet<Double>hashSet) {
      hashSet=setOlustur();
        double toplam=0;
        for ( double a:hashSet) {
            toplam+=a;
        }
        System.out.println("Toplam= "+toplam);
    }
    public static HashSet<Double> setOlustur() {
        HashSet<Double> hashSet=new HashSet<>();
        hashSet.add(3.23);
        hashSet.add(3.10);
        hashSet.add(5.12);
        hashSet.add(10.12);
        hashSet.add(23.12);
        return hashSet;

    }
}

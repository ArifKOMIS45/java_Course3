package gun14;

import java.util.Scanner;

public class _001_MENTOR {
    public static void main(String[] args) {
        /*
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.

        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!

        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.
        5. final notu double değerinde olmalı. (örn: 65,5)

        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.

        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.

        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.
           eğer ortalaması 90 'dan büyük ise, harf notu olarak AA,
        80(80dahil)   ile 90 arasında ise  BA,
        70(70 dahil)   ile 80 arasında ise BB,
        60(60dahil) ile 70 arasında ise CB,
        50(50 dahil) ile 60 arasında ise CC,
        40(40 dahil) ile 50 arasında ise DC,
        30(30 dahil) ile 40 arasında ise DD,
        30 'dan düşük ise FF            gelmeli.
         */

        Scanner read=new Scanner(System.in);
         System.out.print("Vize notunu giriniz"); double vize= read.nextDouble();
         System.out.print("Vize yuzdesini giriniz"); double vizeYuzde= read.nextDouble();

         System.out.print("Final notunu giriniz"); double Final= read.nextDouble();
         System.out.print("Final yuzdesini giriniz"); double FinalYuzde= read.nextDouble();

        double ort= vize*vizeYuzde + Final*FinalYuzde;

        if (ort>90){ System.out.println("AA"); }
        else if (ort>=80) {System.out.println("BA"+ort);}
        else if (ort>=70) {System.out.println("BB"+ort);}
        else if (ort>=60) {System.out.println("CB"+ort);}
        else if (ort>=50) {System.out.println("CC"+ort);}
        else if (ort>=40) {System.out.println("DC"+ort);}
        else System.out.println("FF"+ort);

    }
}

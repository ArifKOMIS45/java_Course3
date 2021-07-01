package gun22;

import java.util.Locale;
import java.util.Scanner;

public class _00_mentoringsplit {
    public static void main(String[] args) {
//split metodu stringi istemnen noktadan itibaren bolyor
        Scanner sc = new Scanner(System.in);
//        System.out.print("Bir atasozu giriniz:");
//        String atasozu=sc.nextLine();
//        String[] kelime=atasozu.split("a");
//        for (String eleman:kelime)
//        {
//            System.out.println(eleman);
//        }


//todo      Scanner ile yazdığınız 3 notun(Double) ortalamasını hesaplatın.


        double[] notlar = new double[3];
        double toplam = 0.0;
        sc.useLocale(Locale.ENGLISH);
        for (int i = 0; i < notlar.length ; i++) {
            System.out.print("Uc not giriniz=");
            notlar[i] = sc.nextDouble();
        }

        for (int j = 0; j < notlar.length; j++) {

            toplam+=notlar[j];
        }
        System.out.println("ortalama = " + toplam / notlar.length);


    }
}

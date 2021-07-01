package gun7;

import java.util.Scanner;

public class _07_ornek {
    public static void main(String[] args) {
        //boy ve kiloyu ondalikli alip ekrana yazdirin
        Scanner boyut= new Scanner(System.in);
//boyut.useLocale(Locale.ENGLISH); bu , yada . gibi sorunlari hallediyor
        System.out.print("Boyunuzu giriniz: "); double boy= boyut.nextDouble();

        System.out.print("Kilonuzu giriniz:");   double kilo=boyut.nextDouble();

        System.out.println("Boyunuz = " + boy +"  " +"Kilonuz:" +kilo );

    }
}

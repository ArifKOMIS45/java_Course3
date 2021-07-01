package gun12;

import java.util.Scanner;

public class _06_JavaRandom {
    //Girilen bir sayiya kadar random sayi ureterek tahmin etmeye calicalim
    //kullanici bilirse tebrikler
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz =");
        int KacaKadarRandomSayi = oku.nextInt();

        int uretilenSayi = (int) (Math.random() * KacaKadarRandomSayi);


        System.out.print("Sayi tahmininiz=");
        int tahmin = (int) oku.nextInt();
//1. yontem norma if ile
        if (uretilenSayi == tahmin)
            System.out.println("Tebrikler bildiniz = ");
        else {
            System.out.println("Bilemediniz");
        }
        //ikinci yontem Ternary ile
        String sonuc = (uretilenSayi == tahmin) ? "Tebrikler bildiniz = " : "Bilemediniz";
        System.out.println("sonuc = " + sonuc);


    }


}

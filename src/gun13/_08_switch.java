package gun13;

import java.util.Scanner;

public class _08_switch {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz=");   int sayi = oku.nextInt();
        int onlarBasamagi=(sayi/10)%10;
        switch (onlarBasamagi) {
            case 0 : System.out.println("sifir"); break;
            case 1 : System.out.println("Bir");break;
            case 2 : System.out.println("Iki");break;
            case 3 : System.out.println("Uc");break;
            case 4 : System.out.println("Dort");break;
            case 5 : System.out.println("Bes");break;
            case 6 : System.out.println("Alti");break;
            case 7 : System.out.println("Yedi");break;
            case 8 : System.out.println("Sekiz");break;
            case 9 : System.out.println("Dokuz");break;
        }





    }
}

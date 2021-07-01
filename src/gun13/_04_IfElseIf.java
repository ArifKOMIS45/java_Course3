package gun13;

import java.util.Scanner;

public class _04_IfElseIf {
    public static void main(String[] args) {
        // Girilen bir sayının önce 100 den küçük ise, 100 den küçük yazsın
        // devamında 50 den küçük ise 50 den küçük yazsın
        // devamında 25 den küçük ise 25 den küçük yazsın.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz=");
        int s = oku.nextInt();

        if (s < 100) {
            System.out.println("100 den kucuk");
            if (s < 50) {
                System.out.println("50 den kucuk");
                if (s < 25) System.out.println("25 den kucuk");
            }
        }
        // alttaki secenekte 80 girildiginde 25 i gereksiz yere kontrol ediyor
        if (s < 100) System.out.println("100 den kucuk");
        if (s < 50) System.out.println("50 den kucuk");
        if (s < 25) System.out.println("25 den kucuk");

    }
}


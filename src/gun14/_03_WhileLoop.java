package gun14;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
        // girilen sayı dahil
        Scanner oku = new Scanner(System.in);
        System.out.print("bir rakam giriniz giriniz=");
        int sayi = oku.nextInt();
//sayi--; bu sekilde sayinin kendisi isleme girmez

        while (sayi>0){
            if (sayi%2>0)
                System.out.println(sayi);
            sayi--;        }



    }
}

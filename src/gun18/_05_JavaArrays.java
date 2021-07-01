package gun18;

import java.util.Scanner;

public class _05_JavaArrays {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı bir diziye atadıktan sonra
        // ayrı bir döngü ile kaç tanesinin tek sayı olduğunu bulunuz.
        Scanner oku = new Scanner(System.in);

        int[] sayilar = new int[7];
        int teksayi = 0;

        for (int i = 0; i < sayilar.length; i++) {

            System.out.print((i + 1) + ".sayi=");
            sayilar[i] = oku.nextInt();

            if (Math.abs(sayilar[i]) % 2 == 1)
                teksayi++; }

            System.out.println("teksayi = " + teksayi);


    }


}



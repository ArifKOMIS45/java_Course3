package gun14;

import java.util.Scanner;

public class _02_WhileLoop {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("bir rakam giriniz giriniz=");
        int sayi = oku.nextInt();

        int toplam = 0;
        while (sayi > 0) {
            toplam = toplam + sayi;
            sayi--;
            // toplam = toplam + sayi--; // bu yukardaki iki satir yerine }
        }
            System.out.println("toplam = " + toplam);

            //sayacli hali

            int sayac = 0;
            toplam = 0;
            while (sayac <= sayi) {
                toplam = toplam + sayac;
                sayac++;
            }
            System.out.println("toplam = " + toplam);



    }}

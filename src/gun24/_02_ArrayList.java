package gun24;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_ArrayList {
    public static void main(String[] args) {
        //Bir ogretmenin girmek istedigi kadar notu aliniz
        // ortalayi gecen ogrenci sayisini bulunuz
        ArrayList<Integer> notlar = new ArrayList<>();
        Scanner oku = new Scanner(System.in);
        Scanner oku2 = new Scanner(System.in);
        String devamMi;
        do {
            System.out.print("not giriniz=");
            int ogrNot = oku.nextInt();
            notlar.add(ogrNot);
            System.out.println("Devam E/H");
            devamMi = oku2.nextLine();

        } while (devamMi.equalsIgnoreCase("H"));

        int toplam = 0;
        for (int i = 0; i < notlar.size(); i++) {
            toplam = toplam + notlar.get(i);
        }
        int ortalama = toplam / notlar.size();

        int ortgecensayisi = 0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i) > ortalama) ortgecensayisi++;

        }
        System.out.println("ortalama = " + ortalama);
        System.out.println("ortgecensayisi = " + ortgecensayisi);

    }


}


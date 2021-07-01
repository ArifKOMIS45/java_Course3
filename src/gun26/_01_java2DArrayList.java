package gun26;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_java2DArrayList {
    public static void main(String[] args) {
        /*******************/
        int sayi = 5; // tek bir rakam saklayabilen değişken
        int[] dizi = new int[5]; // 5 adet rakam saklayabilen değişken.
        int[][] tablo = new int[5][5]; // 5x5 lik 25 adet rakam saklayabilen değişken

        ArrayList<Integer> liste = new ArrayList<>(); // istenildiği kadar rakam eklenebilen değişken
        /*******************/

        int[][] tablo2 = new int[5][5]; //5x5 lik 25 adet rakam saklayabilen değişken

        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>(); // Listelerin listesi


        String[] dersler = new String[3];
        dersler[0] = "Matematik";
        dersler[1] = "Türkçe";
        dersler[2] = "Kimya";

        ArrayList<Integer> matNotlar = new ArrayList<>(); // bu bir liste
        matNotlar.add(90);
        matNotlar.add(80);
        matNotlar.add(70);

        ArrayList<Integer> turNotlar = new ArrayList<>(); // bu bir liste
        turNotlar.add(95);
        turNotlar.add(85);
        turNotlar.add(75);

        ArrayList<Integer> kimNotlar = new ArrayList<>(); // bu bir liste
        kimNotlar.add(60);
        kimNotlar.add(50);
        kimNotlar.add(40);
        kimNotlar.add(30);

        notlarListesi.add(matNotlar);
        notlarListesi.add(turNotlar);
        notlarListesi.add(kimNotlar);

        for (int i = 0; i < matNotlar.size(); i++) {
            System.out.println("matNotlar = " + matNotlar.get(i));
        }

        // tüm notlar
        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println(dersler[i]);
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.println((i + 1) + ".yapraktaki, " + (j + 1) + ".Not = " +
                        notlarListesi.get(i).get(j));  //satır sütun yapısı tablo[i][j]
            }
            System.out.println();
        }

        //Soru 1: Kullanıcıdan alınan ders nosuna göre ekrana Notların Listesini bir fonksiyonda
        //        yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("Ders no(0-mat,1-tur,2-kim)=");
        int dersNO = oku.nextInt();


        dersNotlariYazdir(notlarListesi, dersNO);
//soru:2 yukarida girilen derse ait ortalamayi ekrana yazdirin

        System.out.println("Dersin Ort = " + ortalama(notlarListesi, dersNO));

//tum derslerin ortalamasini mainde(bunun anlami return demekmis) yazdiriniz
        double tumOrtalama = ortalamaTum(notlarListesi);
        System.out.println("tumOrtalama = " + tumOrtalama);
//Soru 4 : Kullacıdan alacağınız, sıradaki tüm derslerin notlarının ortalamasını bulunuz
        // yani tüm derslerdeki 1.Sınavın ortalaması gibi, sınav bilgisini kullanıcıdan alınız

        System.out.print("hangi sinavin ortalasini bulmak istiyorsunuz");
        int sinav = oku.nextInt();
        System.out.println("girdiginiz sinavin ortalamasi="+sinavOrtalama(notlarListesi,sinav));

    }


    public static void dersNotlariYazdir(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo) {

        System.out.println(notlarListesi.get(dersNo));
    }

    public static int ortalama(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo) {
        int toplam = 0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            toplam += notlarListesi.get(dersNo).get(i);
        }
        return toplam / notlarListesi.get(dersNo).size();
    }

    public static double ortalamaTum(ArrayList<ArrayList<Integer>> notlarListesi) {
        double toplam = 0;
        int sayac = 0;
        for (int i = 0; i < notlarListesi.size(); i++) {
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                toplam += notlarListesi.get(i).get(j);
                sayac++;
            }

        }
        return toplam / sayac;
    }


    public static double sinavOrtalama(ArrayList<ArrayList<Integer>> notlarListesi, int sinav) {
        double toplam = 0;
        int sayac = 0;
        for (int i = 0; i < notlarListesi.size(); i++) {
               if (sinav < notlarListesi.get(i).size()) {//siradaki listedeki not sayisi istenen
                   toplam += notlarListesi.get(i).get(sinav);//sinav nodan buyuk ise
                   sayac++;
               }

        }return toplam/sayac;
    }



}



package gun22;

import java.util.Arrays;
import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        // String şeklinde aralarında boşluklarla girilen bir dizinin
        // enbüyük, enküçük elemanını, bütün elemanların toplamını,
        // sayıların ortalamasını ayrı ayrı metodlarda yapınız.
        // 3 4 12 45 67  gibi giriş yapılacak.
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayilari birer boslukla giriniz= ");
        String dizi = oku.nextLine();//okundu

        String[] strDizi = dizi.split(" ");
        int[] intDizi = new int[strDizi.length];
        for (int i = 0; i < strDizi.length; i++) {
            intDizi[i] = Integer.parseInt(strDizi[i]);
        }

        enBuyuk(intDizi);
        enKucuk(intDizi);
        tumTopla(intDizi);
        ortalamaBul(intDizi);


    }

    public static void enBuyuk(int dizi[])//ismi ayni olmak zorunda degil
    {
        Arrays.sort(dizi);
        System.out.println("en buyuk = " + dizi[dizi.length - 1]);
    }

    public static void enKucuk(int dizi[]) {
        Arrays.sort(dizi);
        System.out.println("en kucuk = " + dizi[0]);
    }

    public static void tumTopla(int dizi[]) {
        int toplam = 0;
        for (int j : dizi) {
            toplam += j;
        }
        System.out.println("toplam = " + toplam);
    }

    public static void ortalamaBul(int dizi[]) {
        int toplam = 0;
        for (int j : dizi) {
            toplam += j;
        }
        System.out.println("ortalama = " + toplam / dizi.length); }



}

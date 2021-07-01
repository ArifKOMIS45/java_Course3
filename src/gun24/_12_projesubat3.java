package gun24;

import java.util.Scanner;

public class _12_projesubat3 {

    public static void main(String[] args) {
        //3- Girilen bir sayinin tersiyle ayni olup olmadigini bulunuz.
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        int girilenSayi = oku.nextInt();

        String sayiString = String.valueOf(girilenSayi);

        int[] tersiDizi = new int[sayiString.length()];

        for (int j = 0, i = 1; i <= girilenSayi; i = 10 * i, j++) {
            tersiDizi[j] = girilenSayi / i % 10; }

        String s = "";
        for(int i = 0; i < tersiDizi.length; i++)
            s += "" + tersiDizi[i];
        int tersi = Integer.parseInt(s);

        if (girilenSayi == tersi) System.out.println("Sayi Tersi ile esittir");
        else System.out.println("Sayi Tersi ile esit degildir.");

    }


}

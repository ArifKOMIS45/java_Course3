package gun23;

import java.util.Scanner;

public class _05_JavaMethod {

    public static void main(String[] args) {
        //Kullanicidan ogrenci adi ve notlarini(60 70 90) seklinde
        //3ogrenci ve ogrenci notu alinizbunlarin ortalasinibir metodla bulduktan sonra
        //sonucu ekrana ismet 75 seklinde yazdiriniz mainClass icersinde.

        for (int i = 0; i < 3; i++) {
            Scanner oku = new Scanner(System.in);
            System.out.print("ogrenci ismini giriniz:");
            String isim = oku.nextLine();

            System.out.print("Ogrencinin notlarini giriniz= ");//60 70 80 90
            String strNotlar = oku.nextLine();

            System.out.println("Student ismi; " + isim);
            System.out.println("Ortalamasi= " + ortalamaBul(strNotlar));

        }


    }

        public static int ortalamaBul(String notlar) {
        int toplam = 0;
        String[] notDizi = notlar.split(" ");
        for (int i = 0; i < notDizi.length; i++) {
            toplam += Integer.parseInt(notDizi[i]);
        }
        return toplam / notDizi.length;


    }


}
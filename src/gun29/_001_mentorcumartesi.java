package gun29;

import java.util.Scanner;

public class _001_mentorcumartesi {
    public static void main(String[] args) {
/*
HESAP MAKİNESİ

Sistem sizden 2 adet sayı istesin.

Daha sonra yapılacak işlemler diye bir seçenek çıksın. -- >Yapılacak işlemler :    T (Toplama)  - F (Fark)   - C (Carpma)   -  B (Bölme)
Kullanıcı, 4 işlemin baş harfini kullanarak işlem türü seçilsin.

Bir  static double Sonuc methodu oluşturun ve koşullar bu methodun içerisinde olsun.işlemler bu methodda yapılsın.

kullanıcının seçtiği işlem türü ile işlem yaptırıp konsola yazdırın.
todo KONSOL ÖRNEGİ :

Hesap makinesine hoşgeldiniz !!!

Sayı 1 :  5
Sayı 2 :  6
Yapılacak işlemler :    T (Toplama)  - F (Fark)   - C (Carpma)   -  B (Bölme)
f
Sonuç :   -1.0

 */
hesapMakinesi();



    }

    public static void hesapMakinesi() {
        System.out.println("Hesap makinesine hos geldiniz!!!");
        Scanner oku=new Scanner(System.in);
        System.out.print("1. sayiyi giriniz ="); double sayi1= oku.nextDouble();
        System.out.print("2. sayiyi giriniz ="); double sayi2= oku.nextDouble();


        System.out.print("Yapılacak işlemler : T (Toplama) - F (Fark)   - C (Carpma)   -  B (Bölme)");
        String islem=oku.nextLine();
   double toplam=0;
    if (islem.equalsIgnoreCase("T")){toplam=sayi1+sayi2;}
    if (islem.equalsIgnoreCase("F")){toplam=sayi1-sayi2;}
    if (islem.equalsIgnoreCase("C")){toplam=sayi1*sayi2;}
    if (islem.equalsIgnoreCase("B")){toplam=sayi1/sayi2;}


        System.out.println("Sonuc= "+(int)toplam);
    }


}

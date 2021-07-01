package gun22;

import java.util.Scanner;

public class _05_JavaMethod {
    public static void main(String[] args) {
// Kullanıcıya aşağıdaki gibi bir menü çıkartarak sürekli değişkenleri alınız ve
// her bir menü elemanını değer alan fonksiyon olarak yazınız.
        /*  1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
        Bir işlem seçiniz */
        Scanner oku = new Scanner(System.in);
        int secim = 0;
        do {
            menuYaz();
            secim = oku.nextInt();
            islemYap(secim);

        } while (secim < 6);

    }

    public static void menuYaz()//ismi ayni olmak zorunda degil
    {
        System.out.println("*******MENU*********");
        System.out.println("1-Toplama");
        System.out.println("2-Cikarma");
        System.out.println("3-Carpma");
        System.out.println("4-Bolme");
        System.out.println("5-Faktoriyel");
        System.out.println("6-Cikis");
        System.out.print("Seciminiz=");
    }

    public static void islemYap(int secim) {

        switch (secim) {
            case 1:toplama(); break;
            case 2:cikarma();break;
            case 3:carpma();break;
            case 4:bolme();break;
            case 5:faktoriyel();break; } }

     public static void toplama()
    {   Scanner oku = new Scanner(System.in);
        System.out.print("1.sayiyi giriniz= ");
       int s1= oku.nextInt();
        System.out.print("1.sayiyi giriniz= ");
        int s2= oku.nextInt();
        System.out.println("Sonuc =" + (s1 + s2));}

    public static void cikarma(){
        Scanner oku = new Scanner(System.in);
        System.out.print("1.sayiyi giriniz= ");
        int s1= oku.nextInt();
        System.out.print("1.sayiyi giriniz= ");
        int s2= oku.nextInt();
        if (s1>s2) System.out.println("cikarma=" + (s1- s2)); else
            System.out.println("Sonuc =" + (s2- s1));}

    public static void carpma(){
        Scanner oku = new Scanner(System.in);
        System.out.print("1.sayiyi giriniz= ");
        int s1= oku.nextInt();
        System.out.print("1.sayiyi giriniz= ");
        int s2= oku.nextInt();
         System.out.println("Sonuc=" + (s1*s2));
            }
    public static void bolme(){
        Scanner oku = new Scanner(System.in);
        System.out.print("1.sayiyi giriniz= ");
        double s1= oku.nextDouble();
        System.out.print("1.sayiyi giriniz= ");
        double s2= oku.nextDouble();
        System.out.println("Sonuc=" + (s1/s2));
    }
    public static void faktoriyel(){
        Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz= ");
        int s1= oku.nextInt();
        int toplam=1;
        for (int i = 1; i <=s1 ; i++) {
            toplam*=i;
        }System.out.println("faktoriyel=" + toplam);
    }




}

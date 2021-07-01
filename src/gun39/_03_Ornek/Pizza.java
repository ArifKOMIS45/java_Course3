package gun39._03_Ornek;


import java.util.Scanner;

public class Pizza {
    static int miktarSmall = 0;
    static int miktarMedium = 0;
    static int miktarLarge = 0;
    Size buyukluk;


    static void ekle(Size buyukluk) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Kac adet=");
        int adet = oku.nextInt();

        if (buyukluk == Size.SMALL) miktarSmall += adet;
        if (buyukluk == Size.MEDIUM) miktarMedium += adet;
        if (buyukluk == Size.LARGE) miktarLarge += adet; }


    static void islemYap(int secim) {

        switch (secim) {
            case 1:
                Pizza.ekle(Size.SMALL);
                break;
            case 2:
                Pizza.ekle(Size.MEDIUM);
                break;
            case 3:
                Pizza.ekle(Size.LARGE);
                break;
            case 4:
                Pizza.islemeAl();
                miktarSmall = 0;
                miktarMedium = 0;
                miktarLarge = 0;
                break; } }


    static void islemeAl() {
        System.out.println(Size.SMALL + " " + miktarSmall);
        System.out.println(Size.MEDIUM + " " + miktarMedium);
        System.out.println(Size.LARGE + " " + miktarLarge); }

    static void Menu() {
        System.out.println("*******PIZZA MENU*********");
        System.out.println("1-Small");
        System.out.println("2-Medium");
        System.out.println("3-Large");
        System.out.println("4-Isleme al");
        System.out.println("5-cikis"); }


}










package gun7;

import java.util.Scanner;

public class _05_ornek {
    public static void main(String[] args) {
        //Kullanicidan ad ve soyadini ayri ayri okutarak alip ekrana yazdiriniz
        Scanner girilen = new Scanner(System.in);

        System.out.print("adinizi girin: ");
        String ad = girilen.nextLine();

        System.out.print("soyadinizi girin: ");
        String soyad = girilen.nextLine();

        System.out.println("ad ve soyadiniz = " + ad + " " + soyad);

    }
}

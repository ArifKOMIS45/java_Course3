package gun7;

import java.util.Scanner;

public class _02_javascaner {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        //oku ismine bir okuyucu tanimladi,(System.in) klavyedengiris yapmak uzere
        System.out.print("Bir sayi giriniz :");
        int sayi = oku.nextInt();
        //oku.nextInt() ekranda sayiyi aldi ve bizde sayi degiskenine attik

        System.out.println("Girilen sayi = " + sayi);


    }
}

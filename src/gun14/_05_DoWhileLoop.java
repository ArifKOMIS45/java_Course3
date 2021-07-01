package gun14;

import java.util.Scanner;

public class _05_DoWhileLoop {
    public static void main(String[] args) {
       //kullanicidan sifir girene kada sayi isteyiniz

        Scanner oku = new Scanner(System.in);
        int sayi=0;
        //normal while den farki donguye mutlaka 1 kez girer
        //sart sonda kontrol edilir.
       do {
            System.out.print("rakam giriniz=");
             sayi = oku.nextInt();
        } while (sayi!=0); //sarti burda kontrol ediyor



    }
}

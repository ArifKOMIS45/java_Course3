package gun14;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        //kullanicidan 5 sayi isteyiniz en buyugunu ekrena yazdiriniz
        // TODO: 18.02.2021 burada hep - sayi girilirse sonuc ne yapmalisiz
        Scanner oku = new Scanner(System.in);

        int sayac=0;
        int enb=0;

        while(sayac<5)
            {  System.out.print("rakam giriniz=");
            int sayi = oku.nextInt();

            if(sayi>enb) enb=sayi;

            enb=Math.max(enb,sayi);//yukardaki if li yapiya karsilik kullanilabilir.

            sayac++;} 
        System.out.println("en buyuk sayi = " + enb);

    }
}

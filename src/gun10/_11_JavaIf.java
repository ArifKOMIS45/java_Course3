package gun10;

import java.util.Scanner;

public class _11_JavaIf {
            public static void main (String[]args){
            //Girilen bir sayinin birler basamagini yazi ile yazdiriniz
            Scanner oku = new Scanner(System.in);
            System.out.print("birinci sayiyi giriniz = ");int s1 = oku.nextInt();
            System.out.print("ikinci sayiyi giriniz = "); int s2 = oku.nextInt();
            System.out.print("ucuncu sayiyi giriniz = "); int s3 = oku.nextInt();

            int enb = s1;
            if (enb < s2) {enb = s2;}
            if (enb < s3) {enb = s3;}
            System.out.println("En buyuk sayi = " + enb);}

        }


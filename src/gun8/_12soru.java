package gun8;

import java.util.Scanner;

public class _12soru {
    public static void main(String[] args) {
        //kullanicidan alacginiz 2 kelimelik ad ve sayadi ekrana sadeceisim bas harf. soyisim bas harf nokta seklinde yazdiriniz
        //yani ahmet yilmaz--->A.y olarak yazdiriniz

        Scanner oku=new Scanner(System.in);
        System.out.print("Ad ve Soyadiniz:");
        String ad= oku.nextLine();

        char adBasHarf=ad.charAt(0);
        int boslukindex=ad.indexOf(" ");
        char soyadilkHarf=ad.charAt(boslukindex+1);

        System.out.println("Kisaformat hali = " + adBasHarf+"."+soyadilkHarf+".");


    }
}

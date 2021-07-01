package gun12;

import java.util.Scanner;

public class _02_JavaTernary {
    public static void main(String[] args) {
        // girilen sayi 50 den buyuk ise 1, degilse0 yazdiralim
        //tenary operator ile yazalim
        Scanner oku=new Scanner(System.in) ;
        System.out.print("sayi Giriniz="); int sayi= oku.nextInt();
        //klasik
        if (sayi>50) {
            System.out.println("sonuc= 1");}
        else {System.out.println("sonuc= 0 "); }
        //ternary ile
        int sonuc= (sayi>50 ? 1:0);
        System.out.println("sonuc = " + sonuc);//1. yontem
        System.out.println("sonuc = " + (sayi>50 ? 1:0));//2.yontem

    }
}

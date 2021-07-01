package gun10;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        //Girilen 3 basamakli bir sayinin basamaklarina gore tersii bir sayi
        //olarak ekrana yazdiriniz
        Scanner oku=new Scanner(System.in);
        System.out.print("uc basamakli bir sai giriniz: = " );
        int sayi=oku.nextInt();
        int birler=sayi%10;
        int onlar=(sayi/10)%10;
        int yuzler=sayi/100;

        int tersi=birler*100 + onlar*10 + yuzler;
        System.out.println("tersi = " + tersi);


    }
}

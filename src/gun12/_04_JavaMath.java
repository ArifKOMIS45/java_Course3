package gun12;

import java.util.Scanner;

public class _04_JavaMath {
    public static void main(String[] args) {
        //Math.max yontemi ile girilen 3 sayidan buyuk olani bulunuz
        Scanner oku = new Scanner(System.in);

        System.out.print("a degeri= ");
        int a = oku.nextInt();

        System.out.print("b degeri= ");
        int b = oku.nextInt();

        System.out.print("c degeri= ");
        int c = oku.nextInt();

        System.out.println("en buyuk = " + Math.max(a, Math.max(b, c)));

// 2, yontem
        int enb=Math.max(a,b);
        enb = Math.max(enb,c);
        System.out.println("en buyuk = " + enb);




    }
}

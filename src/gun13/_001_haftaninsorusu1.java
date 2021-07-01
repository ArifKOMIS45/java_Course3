package gun13;

import java.util.Scanner;

public class _001_haftaninsorusu1 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("X kordinatini Giriniz=");   double x= oku.nextDouble();
        System.out.print("y kordinatini giriniz="); double y= oku.nextDouble();

        boolean s1= x>=0 && y>=0;
        boolean s2= x<0 && y>=0;
        boolean s3= x<0 && y<0;
        boolean s4= x>=0 && y<0;
        boolean s5= x==0 && y==0;

        if (s5==true)System.out.println("At origin");
            else{ if (s1==true) {System.out.println("Alan A");}
            else { if (s2==true) System.out.println("Alan B");
            else {if (s3==true) System.out.println("Alan C");
            else {if (s4==true) System.out.println("Alan D"); }}}}

    }
}

package gun13;

import java.util.Scanner;

public class _00_bitmedideneme {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("X kordinatini Giriniz=");   double x= oku.nextDouble();
        System.out.print("y kordinatini giriniz="); double y= oku.nextDouble();

        boolean s1= x>=0 && y>=0;
        boolean s2= x<0 && y>=0;
        boolean s3= x<0 && y<0;
        boolean s4= x>=0 && y<0;
        boolean s5= x==0 && y==0;
//        boolean a=false;
//
//        switch (a!=f){
//           case s1:System.out.println("At origin = " + s5);
//           case s2:System.out.println("Alan A = " + s1);
//           case s3:System.out.println("Alan B = " + s2);
//           case s4:System.out.println("Alan C = " + s3);
//           case s5:System.out.println("Alan D = " + s4);
//
//       }
        if (s5==true)System.out.println("At origin");
        else{ if (s1==true) {System.out.println("Alan A");}
        else { if (s2==true) System.out.println("Alan B");
        else {if (s3==true) System.out.println("Alan C");
        else {if (s4==true) System.out.println("Alan D"); }}}}

    }

}

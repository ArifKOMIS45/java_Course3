package gun11;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
    //Girilen bir sayinin tek mi cift mi oldugunu yazdiriniz
        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayi giriniz=");
        int girilen= oku.nextInt();

        if (girilen%2==0){System.out.println(" Cift sayi girdiniz");}
        else {System.out.println(" tek sayi girdiniz"); }
   }
}

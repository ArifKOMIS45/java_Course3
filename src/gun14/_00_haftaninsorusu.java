package gun14;

import java.util.Scanner;

public class _00_haftaninsorusu {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("bir X kordinati giriniz="); int  x= oku.nextInt();
        System.out.print("bir y kordinati giriniz="); int  y= oku.nextInt();

        if ((x>-2 && x<8 ) && (y >1 && y<4 )) {
            System.out.print("Icinde");}
            else { if ((x==-2 ||x==8 ) && (y ==1 || y==4 )){
                System.out.print("ustunde");
            } else System.out.print(" Disinda");

            }







    }



}

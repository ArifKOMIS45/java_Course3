package gun16;

import java.util.Scanner;

public class _00_mentor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Lutfen PIN kodunu giriniz: ");
        int userPin=sc.nextInt();
        int pinCode=5555;
       while (userPin!=pinCode){

           System.out.println("------Yanlis Pin-------");
           System.out.println("Tekrar Deneyiniz");
           userPin=sc.nextInt();
       }
        System.out.println("Basariyla giris yapildi");




    }
}

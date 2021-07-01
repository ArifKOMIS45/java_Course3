package gun14;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
         //Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.
        Scanner oku = new Scanner(System.in);
        String harf="";

        do {
            System.out.print("harf giriniz=");
            harf = oku.nextLine();
            System.out.println("Program çalışıyor");
        } while (!harf.equalsIgnoreCase("x"));
        System.out.println("Program bitti");





    }
}

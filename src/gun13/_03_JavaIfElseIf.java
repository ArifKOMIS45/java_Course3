package gun13;

import java.util.Scanner;

public class _03_JavaIfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz=");   int s1 = oku.nextInt();
        System.out.print("Ikinci sayisyi giriniz="); int s2= oku.nextInt();

        System.out.println("istediginiz islemin basharfini yazin");
        System.out.println("Toplam T \n Cikarma C\n Carpma P \n Bolme B " );
        Scanner okuStr = new Scanner(System.in);
        String islem= okuStr.next();

        if (islem.equalsIgnoreCase("T"))
            System.out.println("Sonuc ="+ (s1+s2));
        else
             if (islem.equalsIgnoreCase("P"))
                System.out.println("Sonuc ="+ (s1*s2));
        else
            if (islem.equalsIgnoreCase("C"))
                    System.out.println("Sonuc ="+ (s1-s2));
        else
               if (islem.equalsIgnoreCase("B"))
                    System.out.println(" Sonuc ="+ (s1/s2));









    }
}

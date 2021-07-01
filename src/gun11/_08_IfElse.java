package gun11;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {
        // girilen bir sayinin pozitif ve negatif veya 0 oldugunu yzdiriniz
        Scanner oku=new Scanner(System.in) ;
        System.out.println("Bir sayi Giriniz="); int sayi= oku.nextInt();

        if (sayi>0){
            System.out.println("pozitif");

        }
        else {
            if (sayi<0){System.out.println("negatif");}
            else
            {
                System.out.println("sifir");
            }
        }
    }
}

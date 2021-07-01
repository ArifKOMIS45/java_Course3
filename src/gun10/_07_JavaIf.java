package gun10;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayinin negatif mi,pozitif mi oldugunu yazdiriniz.
        //sifir ise sifir yazdiriniz
        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayi giriniz = "); int sayi=oku.nextInt();
        if (sayi>0){
            System.out.println("pozitif");
        }
        if (sayi<0){
            System.out.println("Negatif");
        }
        if (sayi==0){
            System.out.println("sifir");
        }
    }
}

package gun10;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        //girilen iki sayidan buyuk olaninin degerini ekrana yazdiriniz,
        // esit ise esit yazdiriniz
        Scanner oku=new Scanner(System.in);
        System.out.print("birinci sayiyi giriniz = "); int sayi1=oku.nextInt();
        System.out.print("ikinci sayiyi giriniz = "); int sayi2=oku.nextInt();

        if (sayi1>sayi2){
            System.out.println("buyuk sayi="+ sayi1);
        }
  if (sayi1<sayi2){
      System.out.println("buyuk sayi="+ sayi2);
        }
   if (sayi1==sayi2){
      System.out.println("sayilar esittir");
  }
    }
}

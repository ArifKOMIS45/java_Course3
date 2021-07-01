package gun11;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        // yan yana aralarinda bir boslukla girilen 2 int sayinin
        // birbirine esit olup olmadigini bulunuz
        Scanner oku=new Scanner(System.in) ;
        System.out.print("aralarinda bir bosluk ile iki sayi giriniz="); String sayilar= oku.nextLine();

       int bosluk=sayilar.indexOf(" ");//boslugu buluyor
       String strsayi1=sayilar.substring(0, bosluk);//burdaki sayi string halinde
       String strsayi2=sayilar.substring(bosluk+1);

       //if (sayilar.substring(0, bosluk).equals(sayilar.substring(bosluk+1)))
       // yukardaki ifade eger iki stringi direk karsilastirmak icin

       int sayi1=Integer.parseInt(strsayi1);//yukardaki stringi sayi haline getiriyor
       int sayi2=Integer.parseInt(strsayi2);

        if (sayi1==sayi2){
            System.out.println(" esittir");
        }
else
        {
            System.out.println("esit degildir");
        }


    }
}

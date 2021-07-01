package gun12;

import java.util.Scanner;

public class _08_JavaRandom {
    public static void main(String[] args) {
        // Kullanıcıdan alt ve üst değeri  tek bir satırda arasında virgul olarak
        // sonra max değeri) alarak sayı üretiniz ve ekrana yazdırınız.
        // 34 56 şeklinde tek bir satırda girecek min ve max ı   5, 75

        Scanner oku=new Scanner(System.in);

        System.out.print(("minimum"+","+"maximum-> seklinde iki sayi giriniz="));
        String hepsi = oku.nextLine();

        String s1=hepsi.substring(0,hepsi.indexOf(","));
        String s2=hepsi.substring(hepsi.indexOf(",")+1);

        int sayi1=Integer.parseInt(s1);
        int sayi2=Integer.parseInt(s2);

        int max=Math.max(sayi1,sayi2);
        int min=Math.min(sayi1,sayi2);

        System.out.println("min = " + min);
        System.out.println("max = " + max);


        int uretilenSayi=(int)(Math.random()*((max-min)+1) + min);

        System.out.println("uretilenSayi = " + uretilenSayi);


    }
}

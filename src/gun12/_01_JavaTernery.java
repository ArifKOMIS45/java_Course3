package gun12;

import java.util.Scanner;

public class _01_JavaTernery {
    public static void main(String[] args) {
        // Kullanıcının gireceği sayı çift ise bir stringe "çift" atayınız,
        // tek ie "tek" atayınız ve ekrana stringi yazdırınız.


        Scanner oku=new Scanner(System.in) ;
        System.out.print("sayi Giriniz="); int sayi= oku.nextInt();

        String text="";//baslangic stringi bos oldugunu belirtiyor

        //klasik yontem
        if (sayi%2==0)
            text="cift";
        else
            text="tek";
        System.out.println("text = " + text);

        //Ternary operator 2.yontem
        text= (sayi%2==0) ? "cift":"tek";
        System.out.println("text = " + text);

        //Ternary Operator 3. yontem
        System.out.println("text = " + ((sayi%2==0) ? "cift":"tek="));



    }
}

package gun14;

import java.util.Scanner;

public class _002_mentor {
    public static void main(String[] args) {
        /*
        Sistem şu mesajı versin :    1.Stringi giriniz."String s1 oluşturunuz.
                                     2.String i giriniz.String s2 oluşturunuz.
                                    3.String'i giriniz.
        String s3 oluşturunuz.
        Girilen 3 Stringin de tek tek karakter sayıları bulunsun.
        3 stringin de karakter sayıları toplansın.
        sonuc 10'dan küçük ise   "Kısa mesaj"
        sonuç    10'dan büyük VE  15 ten küçük ise (10 ve 15 dahildir) "Orta Uzunlukta mesaj" ----- VE = &&
        sonuç  15'ten fazla ise         "Uzun Mesaj"
*/

        Scanner read=new Scanner(System.in);
        System.out.print("kelime giriniz"); String k= read.nextLine();
        System.out.print("kelime giriniz"); String k1= read.nextLine();
        System.out.print("kelime giriniz"); String k2= read.nextLine();
        int u=k.length() + k1.length() +k2.length();


//        if (u<10){ System.out.println("kisa mesaj= "+u); }
//        if (u>=10&& u<=15){ System.out.println("orta mesaj= "+u); }//else kullanmazsan&& aralik vermeli
//        if (u>15){ System.out.println("uzun mesaj= "+u); }
        if (u<10){ System.out.println("kisa mesaj= "+u);}
        else if ( u>15){ System.out.println("uzun mesaj= "+u);}
        else System.out.println("orta uzunukta mesaj= "+u);




    }
}

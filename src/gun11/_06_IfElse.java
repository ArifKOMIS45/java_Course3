package gun11;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı...olmamali demek icin ! kullaniyoruz
        // 3) en fazla 12 karakter olmalı.

        Scanner oku=new Scanner(System.in) ;
        System.out.print("Kod Giriniz="); String kod= oku.nextLine();

    if (kod.length()>=8 && !kod.toLowerCase().contains("pass") && kod.length()<=12)

    {
        System.out.println("uygundur");
    }
    else
    {
        System.out.println("kod uygun degil");
    }

    }
}

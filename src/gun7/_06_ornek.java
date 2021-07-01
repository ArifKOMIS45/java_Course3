package gun7;

import java.util.Scanner;

public class _06_ornek {
    public static void main(String[] args) {
        Scanner girilen = new Scanner(System.in);
        // kullanicidan alacaginiz 2 tam sayininp toplaminni ekrana yazdiriniz

        System.out.print("birinci sayiyi girin :");
        int a = girilen.nextInt();

        System.out.print("ikinci sayiyi girin:");
        int b = girilen.nextInt();

        int sonuc = a + b;//System.out.println("Toplam = " + (a+b)); yazarsak bu satira gerek kalmiyabilir
        System.out.println("Toplam = " + sonuc);
        //ikinci yontem
        //System.out.println("Toplam = " + (a+b));

    }
}

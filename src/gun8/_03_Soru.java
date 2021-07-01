package gun8;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        //girilen bir stringin sadece son harfini yazdirin

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir String Giriniz: ");
        String girilen = oku.nextLine();
        //012345678901
        //ismet temur, once uzunlugu bulursun,charAt(uzunluk)
        int uzunluk = girilen.length();
        char sonHarf = girilen.charAt(uzunluk - 1);
        //Fakat karakterlerin sira numarasi(index) ise 0 dan baslar
        System.out.println("sonHarf = " + sonHarf);


    }
}

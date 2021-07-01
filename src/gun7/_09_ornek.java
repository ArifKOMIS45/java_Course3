package gun7;

import java.util.Scanner;

public class _09_ornek {
    public static void main(String[] args) {


        Scanner oku=new Scanner(System.in);
        System.out.print("Cadde adini yaziniz: "); String cadde= oku.nextLine();
        System.out.print("ulkenizi giriniz:"); String ulke= oku.nextLine();
        System.out.print("sokak adini giriniz:"); String sokak= oku.nextLine();
        Scanner oku1=new Scanner(System.in);

        System.out.print("Posta kodunuzu giriniz:"); int posta= oku1.nextInt();

        //String Adres=cadde+"  "+sokak+"  "+posta+"  "+ulke;
        //System.out.println("Adres = " + Adres);
        System.out.println("Caddesi"+cadde+" Sokak"+sokak+" , Posta kodu="+posta+" ,Ulke="+ ulke+"");




    }
}

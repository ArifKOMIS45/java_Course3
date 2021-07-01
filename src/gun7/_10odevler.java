package gun7;

import java.util.Scanner;

public class _10odevler {
    public static void main(String[] args) {
        //1
        Scanner oku=new Scanner(System.in);
        System.out.print("Isminizi girin:");
        String isim=oku.nextLine();
        System.out.println("Adiniz:" + isim);
        //2
        Scanner intOku=new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int sayi=intOku.nextInt();
        System.out.println("Girdiginiz sayi = " + sayi);
        //3
        System.out.print("Sevdiginiz meyveyi yazin:"); String meyve= oku.nextLine();
        System.out.println("Meyveniz = " + meyve);
        //4
        System.out.print("Arabanizin kapi sayisini girin:"); int intKapi=intOku.nextInt();
        System.out.println("Aracinizin kapi sayisi = " + intKapi);
        //5
        System.out.print("On sene once yasadiginiz sehrin ismini yazin"); String sehir=oku.nextLine();
        System.out.println("Eski sehriniz = " + sehir);
        //6
        System.out.print("Dogum gununuz haftanin hangi gunudur? :"); String dogum=oku.nextLine();
        System.out.println("Dogum gununuz = " + dogum);
        //7
        System.out.print("Bir banka hesabiniz varmi?:"); boolean banka=oku.nextBoolean();
        System.out.println("Banka hesabiniz = " + banka);
        //8
        System.out.println("Haftalik kac kilo elma yersiniz ?: "); byte elma=intOku.nextByte();
        System.out.println("Tukettiginiz elma = " + elma+ "kg dir");
        //9
        System.out.print("Boyunuzu girin:");
        float boyut=intOku.nextFloat();
        System.out.println("boyut = " + boyut);

   }

}

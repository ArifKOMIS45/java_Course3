package gun34.soru2;

import java.util.Scanner;

public class Bisiklet {
    int hiz;
    int vites;

    public static void islemYap(Bisiklet bisiklet, int secim) {
        switch (secim) {
            case 1:
                System.out.print("Hiz giriniz= ");
                Scanner oku = new Scanner(System.in);
                int yeniHiz = oku.nextInt();
                bisiklet.hizdegistir(yeniHiz);
                break;
            case 2:
                bisiklet.vitesArtir();
                break;
            case 3:
                bisiklet.vitesAzalt();
                break;
            case 4:
                bisiklet.durumYazdir();
                break; }
    }

    @Override
    public String toString() {
        return "Bisiklet{" +"hiz=" + hiz +", vites=" + vites +'}';
    }

    public static void menuYaz() {
        System.out.println("*********Bisiklet Kontrol Paneli**********");
        System.out.println("1-Yeni Hiz Ver");
        System.out.println("2-Vites Yukselt");
        System.out.println("3-Vites Azalt");
        System.out.println("4-Durum Goster");
        System.out.print("Seciniz= "); }

    public static Bisiklet bisikletOlustur() {
        Bisiklet bisiklet = new Bisiklet();
        bisiklet.hiz = 0;
        bisiklet.vites = 1;
        return bisiklet; }

    public void hizdegistir(int yeniHiz)
    {
        hiz = yeniHiz;
    }

    public void vitesArtir() {
        vites++;
        if (vites > 5) {
            System.out.println("vites 5 ten buyuk olamaz");
            vites = 5;
        } }

    public void vitesAzalt() {
        vites--;
        if (vites < 1) {
            System.out.println("vites 1 den kucuk olamaz");
            vites = 1;
        } }

    public void durumYazdir() {
        System.out.println("hiz= " + hiz);
        System.out.println("vites = " + vites); }


}

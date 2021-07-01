package gun38.StaticModifier.ornek1;

import java.util.ArrayList;

public class Okul {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci("Ali", "Yilmaz");
        Ogrenci ogr2 = new Ogrenci("Ayse", "Demir");
//      ....
//      ....
//      ......

        Ogrenci ogr500 = new Ogrenci("Hilal", "Bayrak");

        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr2 = " + ogr2);
        System.out.println("ogr500 = " + ogr500);
        System.out.println("____________________");

        ArrayList<String> hepsi = new ArrayList<>();
        hepsi.add(ogr1.toString());
        hepsi.add(ogr2.toString());
        hepsi.add(ogr500.toString());
        hepsi.forEach(System.out::println);

    }
}

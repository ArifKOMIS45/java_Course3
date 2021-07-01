package gun24;

import java.util.ArrayList;
import java.util.Collections;

public class _03_ArrayList {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemanı
        // Array i sıralatırken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.
ArrayList<Integer> rakamlar=new ArrayList<>();
rakamlar.add(55);
rakamlar.add(45);
rakamlar.add(35);
rakamlar.add(25);
        System.out.println("rakamlar = " + rakamlar);
        //Siralama yapar
        Collections.sort(rakamlar);
        System.out.println("rakamlar = " + rakamlar);

        //tersine cevirir
        Collections.reverse(rakamlar);
        System.out.println("rakamlar = " + rakamlar);

        System.out.println("Listeki en buyuk = " + Collections.max(rakamlar));
        System.out.println("Listeki en kucuk = " + Collections.min(rakamlar));

        //Butun elemanlari bir deger atama
        Collections.fill(rakamlar,8);
        System.out.println("rakamlar = " + rakamlar);

        //belli bir degerdeki elemanlara baska bir deger atara
        Collections.replaceAll(rakamlar,8,9);
        System.out.println("rakamlar = " + rakamlar);




    }


}


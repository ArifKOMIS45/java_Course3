package gun27;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {
        //tanimladigi sekilde sabit eleman sayili
        int sayi = 5;//hafizade 1 rakam sakliyor
        int[] dizi = new int[5];//hafizada 5 rakamlik yer sakliuor
        int[][] tablo = new int[5][5];//2D- bir tanimlamada 25 tane sayilik yer tanimladik

        //eleman sayisina gore dinamik artan yada azalanbir yapi gerekli
        ArrayList<Integer> liste = new ArrayList<>();//dinamik buyuyebilen dizi;
        ArrayList<ArrayList<Integer>> listelerinListesi = new ArrayList<>();

//Bana artik tek tek eleman tutan bir liste veya dizi degiskeni yerine tekrarli elemanlara izin
        //vereyenbir yapi gerekiyorsa
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);
        System.out.println("list = " + list);
//tekrarlara izin vermeyen eleman
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(2);
        boolean eklendiMi = hs1.add(4);
        System.out.println("eklendiMi = " + eklendiMi);

        System.out.println("hs1 = " + hs1);
        HashSet<Integer> hs2 = new HashSet<>(list);
        System.out.println("hs2 = " + hs2);


    }
}

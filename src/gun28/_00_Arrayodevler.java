package gun28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _00_Arrayodevler {
    public static void main(String[] args) {
        //1
//        ArrayList<String> liste = new ArrayList<>();
//        liste.add("Orange");
//        liste.add("Kiwi");
//        liste.add("Peach");
//        liste.add("Banana");
//        liste.add("Orange");
//        String Orange;
//
//        System.out.println(getCount(liste, "Orange"));
        //2
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);
//
//        System.out.println("toplam= "+getSum(liste));
        //3
//        System.out.println(getLength(liste));

        //4
        ArrayList<String> uzun = new ArrayList<>();
        uzun.add("yellow");
        uzun.add("red");
        uzun.add("blue");
        uzun.add("red");
        uzun.add("blue");

        String blue = "blue";
        String y = "yellow";
        System.out.println(changelnArraylist(uzun, blue, y));
        //5
        System.out.println(rotateList(uzun));
        //6
        System.out.println(hillNum(liste));
        //7
        ArrayList<Integer> liste1 = new ArrayList<>();
        liste1.add(1);
        liste1.add(2);
        liste1.add(3);
        liste1.add(7);
        liste1.add(8);


        System.out.println(liste1);

        System.out.println(hillNum(liste, liste1));
        //8
        secondMax(liste1);
        //9
        System.out.println(rangeBtw(liste1, 2, 7));
        //10

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        ArrayList<Integer> seri1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> seri2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        ArrayList<Integer> seri3 = new ArrayList<>(Arrays.asList(7, 8, 9));

        list.add(seri1);
        list.add(seri2);
        list.add(seri3);
        ArrayList<Integer> yeni = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                yeni.add(list.get(i).get(j));
            }
        }
        System.out.println(yeni);


    }


    public static int rangeBtw(ArrayList<Integer> arr, int min, int max) {
        int count = 0;
        for (int eleman : arr) {
            if (eleman >= min && eleman <= max) count++;
        }
        return count;
    }

    public static void secondMax(ArrayList<Integer> arr) {
        Collections.sort(arr);
        System.out.print("second max is =" + arr.get(arr.size() - 2));
    }


    public static ArrayList<Integer> hillNum(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> sonuc = new ArrayList<>();
        for (int eleman : a) {
            for (int sayi : b) {
                if (eleman == sayi) sonuc.add(eleman);
            }
        }
        return sonuc;
    }

    public static int hillNum(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size() - 2; i++) {
            if (arr.get(i + 1) < arr.get(i) && arr.get(i + 1) > arr.get(i + 2)) count++;
        }
        return count;
    }


    public static ArrayList<String> rotateList(ArrayList<String> a) {
        ArrayList<String> tersi = new ArrayList<>();
        for (int i = a.size() - 1; i >= 0; i--) {
            tersi.add(a.get(i));
        }

        //Collections.reverse(a);  kolay yol
        return tersi;
    }

    public static ArrayList<String> changelnArraylist(ArrayList<String> a, String b, String c) {
        for (String eleman : a) {
            if (b.equals(eleman)) Collections.replaceAll(a, eleman, c);
        }
        return a;
    }

    public static int getCount(ArrayList<String> a, String b) {
        int count = 0;
        for (String eleman : a) {
            if (b == eleman) count++;
        }
        return count;
    }

    public static int getSum(ArrayList<Integer> arr) {
        int toplam = 0;
        for (int a : arr) {
            toplam += a;
        }
        return toplam;
    }

    public static ArrayList<Integer> getLength(ArrayList<String> arr) {

        ArrayList<Integer> uz = new ArrayList<>();
        for (String eleman : arr) {
            uz.add(eleman.length());
        }
        return uz;
    }

}

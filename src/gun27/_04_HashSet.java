package gun27;

import java.util.Arrays;
import java.util.HashSet;

public class _04_HashSet {
    //bir hashset random olarak 10 adet olacak sekilde 1den 20 e kadar
    //olan sayilarla dolduran fonksiyonu yaziniz
    public static void main(String[] args) {
HashSet<Integer> hs=doldur();
        System.out.println("hs = " + hs);
        System.out.println("hs.size() = " + hs.size());

        // Soru 2 : Bu SET i bir fonksiyonda diziye çeviriniz.
        // mainClass de yazdırınız bu diziyi.
            Integer[] dizi=convertToArray(hs);
        dizi=hs.toArray(dizi);
            System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));





    }

    public static HashSet<Integer> doldur () {
        HashSet<Integer> set= new HashSet<>();
//        for (int i = 0; i <10 ; i++) {
//            int a=(int)(Math.random()*21+1);
//            setA.add(a);
//        }
        while (set.size()<10){

            int a=(int)(Math.random()*19+1);
            set.add(a);
        }
        return set;
    }

    public static Integer[] convertToArray(HashSet<Integer> a) {
//1. yontem
        Integer[] dizi=new Integer[a.size()];
       int sayac=0;
        for (int e:a) {
        dizi[sayac++]=e;
        //sayac++;
        }
        //2.yontem
        dizi=a.toArray(new Integer[a.size()]);

        return dizi;
    }

}



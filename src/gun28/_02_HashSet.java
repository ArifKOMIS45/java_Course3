package gun28;

import java.util.Arrays;
import java.util.HashSet;

public class _02_HashSet {
    public static void main(String[] args) {
        Integer[] dizi = new Integer[]{1, 2, 3, 4, 5, 5};//bir dizi

        HashSet<Integer> hs1 = new HashSet<>(Arrays.asList(dizi));
        HashSet<Integer> hs2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        System.out.println("hs1 = " + hs1);
        System.out.println("hs2 = " + hs2);
//ortk elemanlari bulma:kesisim
        HashSet<Integer> hsKesisim = new HashSet<>(hs1);//hs1 e esitlendi
        hsKesisim.retainAll(hs2);//ortak elemanlari
        System.out.println("hsKesisim = " + hsKesisim);
        //Farkini bulmak
        HashSet<Integer> hsFark = new HashSet<>();
        hsFark.addAll(hs1);//hs1 eklenmis oldu
        hsFark.removeAll(hs2);//farki bulunmus oldu
        System.out.println("hsFark = " + hsFark);
    }
}   /*  hs1 = [1, 2, 3, 4, 5]
        hs2 = [4, 5, 6, 7, 8]
        hsKesisim = [4, 5]
        hsFark = [1, 2, 3]      */






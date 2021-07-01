package gun32;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _01_mentor {
    public static void main(String[] args) {
        //todo      Hashset, TreeSet ve LinkedHashSet oluşturunuz ve elemanlarını yazdırınız.
        //              [1, 6, 33, 15, 22, 7, 8, 4, 3, 6]

        HashSet<Integer> hashSet=new HashSet<>(generateNumbers());

        TreeSet<Integer> treeSet=new TreeSet<>(generateNumbers());

        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>(generateNumbers());

        System.out.println("HashSet ="+hashSet);
        System.out.println("TreeSet ="+treeSet);
        System.out.println("LinkedHashSet= "+linkedHashSet);



    }

    public static ArrayList<Integer> generateNumbers() {
        int[] dizi={1, 6, 33, 15, 22, 7, 8, 4, 3, 6};
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i:dizi)
                { arrayList.add(i);

        } return arrayList;

    }

}

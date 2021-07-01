package gun31;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _04mentor {
    public static void main(String[] args) {
        Integer[] dizi = new Integer[]{1, 3, 5, 7, 9};
        HashSet<Integer> hsInt = new HashSet<>(Arrays.asList(dizi));

        HashSet<Integer> hsInt2 = new HashSet<>(Arrays.asList(56, 66, 34, 98, 11));

        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(56, 66, 34, 98, 11));


        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(56, 66, 34, 98, 11));


        System.out.println("Normal Hashset"+ hsInt);
        System.out.println("------------------");
        System.out.println("Normal Hashset"+hsInt2);
        System.out.println("------------------");
        System.out.println("Treeset Hashset"+treeSet);
        System.out.println("------------------");
        System.out.println("Linked Hashset"+linkedHashSet);
    }
}
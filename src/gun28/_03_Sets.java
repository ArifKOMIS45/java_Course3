package gun28;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("uc");
        hs.add("dort");
        hs.add("bes");
        System.out.println("hs = " + hs);//hs = [bes, dort, iki, bir, uc] Hash Algoritmasina bagli siralamasina gore saklar

        LinkedHashSet<String> lhs = new LinkedHashSet<>();//eklenme sirasina gore tutuyor
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("uc");
        lhs.add("dort");
        lhs.add("bes");
        System.out.println("lhs = " + lhs);//[bir, iki, uc, dort, bes]//eklenme sirasina gore

        TreeSet<String> ts = new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("uc");
        ts.add("dort");
        ts.add("bes");
        System.out.println("Ts = " + ts);//Ts = [bes, bir, dort, iki, uc]   Alfabetik siraliyor

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(1);
        ts2.add(2);
        ts2.add(45);
        ts2.add(6);
        ts2.add(38);
        System.out.println("Ts2 = " + ts2);//[1, 2, 6, 38, 45] siraliyor







    }
}





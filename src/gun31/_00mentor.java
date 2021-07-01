package gun31;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _00mentor {
    public static void main(String[] args) {
        //Hashset=kumedir,her elemandan bir tane oluyor,oncelik(index) yoktur
        //sadece bir tane null deger alabilir
        //LinkHashset te giris sirasina dikkat eder
        //Treeset Alfabaetik olarak yani sirali yazar

        //Array(dize) ile farklari,Arraylerde birden fazla yazabiliriz
        //Arraylerde index vardir.
        HashSet<String> set=new HashSet<>();
        set.add("Kartal");
        set.add("yilan");
        set.add("Tavsan");
        set.add("Cekirge");
        set.add("Yaprak");
        set.add("Su");
        System.out.println("Set----->"+set);
        System.out.println("----------------------------------------");

        TreeSet<String> Treeset=new TreeSet<>();
        Treeset.add("Kartal");
        Treeset.add("yilan");
        Treeset.add("Tavsan");
        Treeset.add("Cekirge");
        Treeset.add("Yaprak");
        Treeset.add("Su");
        System.out.println("TreeSet----->"+Treeset);
        System.out.println("----------------------------------------");


        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Kartal");
        linkedHashSet.add("yilan");
        linkedHashSet.add("Tavsan");
        linkedHashSet.add("Cekirge");
        linkedHashSet.add("Yaprak");
        linkedHashSet.add("Su");
        System.out.println("linkedHashSet----->"+linkedHashSet);


    }
}

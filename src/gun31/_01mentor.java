package gun31;

import java.util.HashSet;

public class _01mentor {
    public static void main(String[] args) {

        HashSet hs=new HashSet<>();
        hs.add(12);
        hs.add("12");
        hs.add(3.5);
        hs.add("true");

        System.out.println(hs);
        System.out.println("-------------------------------_01mentor");

        hs.clear();
        System.out.println(hs);

    }
}

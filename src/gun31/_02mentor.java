package gun31;

import java.util.HashSet;

public class _02mentor {
    public static void main(String[] args) {

        HashSet hs=new HashSet<>();
        hs.add(12);
        hs.add("12");
        hs.add(3.5);
        hs.add("true");

        System.out.println(hs);
        System.out.println("-------------------------------");

       if (hs.remove("akkk")){
           System.out.println("Silindi");
       }else System.out.println("Boyle bir veri yok");
        System.out.println("----------------------------------");
       System.out.println(hs);


    }
}

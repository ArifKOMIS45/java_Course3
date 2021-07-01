package gun29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _03_JavaMaps {
    public static void main(String[] args) {
        //Hashmap,linkedHashmap,Treemap

        //Hashmap;Hizli islem icin kendine gore bir sirada sakalar
        Map<Integer,String> hm=new HashMap<>();
        hm.put(9,"fox");
        hm.put(2,"cat");
        hm.put(30,"dog");
        hm.put(4,"swan");
        hm.put(7,"bear");
        hm.put(11,"snake");
        System.out.println("hm = " + hm);
//LInked ekleme sirasina gore saklar
        Map<Integer,String> hm1=new LinkedHashMap<>();
        hm1.put(9,"fox");
        hm1.put(2,"cat");
        hm1.put(30,"dog");
        hm1.put(4,"swan");
        hm1.put(7,"bear");
        hm1.put(11,"snake");
        System.out.println("hm1 = " + hm1);
//Tree her zaman keylere gore saklar
        Map<Integer,String> hm2=new TreeMap<>();
        hm2.put(9,"fox");
        hm2.put(2,"cat");
        hm2.put(30,"dog");
        hm2.put(4,"swan");
        hm2.put(7,"bear");
        hm2.put(11,"snake");
        System.out.println("hm2 = " + hm2);




    }



}

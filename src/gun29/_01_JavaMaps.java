package gun29;

import java.util.HashMap;
import java.util.Map;

public class _01_JavaMaps {
    public static void main(String[] args) {
        //maps
        //Map ailesinden Hashmap tanimlandi
        //key sadece bir deger tutabiliyor
        Map<Integer, Integer> m = new HashMap<>();// key i ve Value integer olan bir MAP tanimladim.
        m.put(2, 11);//2 KEY ine 11 atandi.
        m.put(3, 12);
        m.put(6, 13);
        m.put(2, 14);//key 2 deki degeri 11--> 14 update ediyor
        //1. yontem
        System.out.println("m.get(2) = " + m.get(2));//2 anahtarindaki deger alindi m.get(2) = 14
        System.out.println("m.keySet() = " + m.keySet());//anahtar listesi m.keySet() = [2, 3, 6]
        System.out.println("m.values() = " + m.values());// deger listesi m.values() = [14, 12, 13]
        System.out.println("m = " + m);//m = {2=14, 3=12, 6=13}
        //2.yontem
        for (Integer ky : m.keySet()) {
            System.out.println("ky = " + ky);
        }
        for (Integer vl : m.values()) {
            System.out.println("vl = " + vl);
        }
        for (Map.Entry<Integer, Integer> anahtarValue : m.entrySet()) {
            System.out.println("anahtarValue.getKey() = " + anahtarValue.getKey());
            System.out.println("anahtarValue.getValue() = " + anahtarValue.getValue());
        }
        boolean buAnahtarVarMI=m.containsKey(2);
        boolean buDegerVarMI=m.containsValue(12);
        System.out.println("buAnahtarVarMI = " + buAnahtarVarMI);
        System.out.println("buDegerVarMI = " + buDegerVarMI);


        m.remove(2);
        System.out.println("remove 2den sonra m = " + m);

        m.clear();
        System.out.println("cleardan sonra = " + m);

//        m.get(2) = 14
//        m.keySet() = [2, 3, 6]
//        m.values() = [14, 12, 13]
//        m = {2=14, 3=12, 6=13}
//        ky = 2
//        ky = 3
//        ky = 6
//        vl = 14
//        vl = 12
//        vl = 13
//        anahtarValue.getKey() = 2
//        anahtarValue.getValue() = 14
//        anahtarValue.getKey() = 3
//        anahtarValue.getValue() = 12
//        anahtarValue.getKey() = 6
//        anahtarValue.getValue() = 13
//        buAnahtarVarMI = true
//        buDegerVarMI = true
//        remove 2den sonra m = {3=12, 6=13}
//        cleardan sonra = {}



    }

}

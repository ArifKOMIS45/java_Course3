package gun31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class _00_odevler {
    public static void main(String[] args) {
        HashMap<String, Integer> hayvanlar = new HashMap<>();
        hayvanlar.put("Lion", 1);
        hayvanlar.put("Tiger", 2);
        hayvanlar.put("Cat", 3);
        hayvanlar.put("Elephant", 4);
        hayvanlar.put("Dog", 5);
        returnKey(hayvanlar);
        returnValue(hayvanlar);


    }

    public static void returnValue(HashMap<String, Integer> a) {
        ArrayList<Object> arrayList = new ArrayList<>();
        for (Map.Entry<String, Integer> anahtarValue : a.entrySet()) {
            arrayList.add(anahtarValue.getValue());
        }
        System.out.println(arrayList);
    }

    public static void returnKey(HashMap<String, Integer> a) {
        ArrayList<Object> arrayList = new ArrayList<>();
        for (Map.Entry<String, Integer> anahtarValue : a.entrySet()) {
            arrayList.add(anahtarValue.getKey());
        }
        System.out.println(arrayList);

    }

    public static String map1(Map<Integer, String> a, int b) {
        String donen = "";
        if (b <= a.size()) {
            donen = a.get(b);
        } else donen = "Boyle bir deger yok";
        return donen;

    }
}

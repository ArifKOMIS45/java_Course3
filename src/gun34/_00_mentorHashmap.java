package gun34;

import java.util.HashMap;

public class _00_mentorHashmap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Amazon", "296 Euro");
        map.put("Ebay", "278 Euro");
        map.put("Saturn", "300");
        map.put("Mediamarkt", "310 Euro");
        map.put("Apple Store", "340 Euro");
        System.out.println(map);

        System.out.println("map.size() = " + map.size());

        HashMap<String, String> map2 = new HashMap<>();
//        map2 = new HashMap<>(map);
        map2.putAll(map);
        System.out.println("map2 = " + map2);

//        map.clear();
//        System.out.println("map clearden sonra = " + map);
//        System.out.println(map.isEmpty());

        String magza = "Saturn1";
        if (map.containsKey(magza)) {
            System.out.println("deger" + map.get(magza));
        } else {
            System.out.println("Bu mapte boyle bir magza yoktur");
        }
        System.out.println(map.containsKey("Saturn"));


        String fiyat = "310 Euro";
        if (map.containsValue(fiyat)) System.out.println("Bu fiyatta nir satici bulundu");
        else System.out.println("bu fiyatta bir satici bulunamasi");

        System.out.println(map.containsValue("310 Euro"));


        System.out.println(map.get("Saturn"));//"Saturn" keyinin degerini getir


        System.out.println(map.keySet());
        System.out.println(map.values());















    }
}

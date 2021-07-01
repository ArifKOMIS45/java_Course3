package gun34;

import java.util.HashMap;
import java.util.Map;

public class _01_mentorHashmap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Amazon", "296 Euro");
        map.put("Ebay", "278 Euro");
        map.put("Saturn", "300 Euro");
        map.put("Mediamarkt", "310 Euro");
        map.put("Apple Store", "340 Euro");

        System.out.println(map);

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            System.out.println(value);

            String key = entry.getKey();
            System.out.println(key);

            entry.setValue("100 Euro"); }

        System.out.println(map.values());


    }
}

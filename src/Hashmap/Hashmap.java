package Hashmap;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("USA", 130);
        map.put("China", 125);
        System.out.println(map);

        if (map.containsKey("Indonesia")) {
            System.out.println("present");
        } else {
            System.out.println("not present");
        }

        System.out.println(map.get("China"));

        Integer indonesiaValue = map.get("Indonesia");
        if (indonesiaValue != null) {
            System.out.println(indonesiaValue);
        } else {
            System.out.println("Key 'Indonesia' is not present in the map");
        }
    }
}

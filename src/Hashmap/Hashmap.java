package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("USA", 130);
        map.put("China", 125);
//        System.out.println(map);
//
//        if (map.containsKey("Indonesia")) {
//            System.out.println("present");
//        } else {
//            System.out.println("not present");
//        }
//
//        System.out.println(map.get("China"));
//
//        Integer indonesiaValue = map.get("Indonesia");
//        if (indonesiaValue != null) {
//            System.out.println(indonesiaValue);
//        } else {
//            System.out.println("Key 'Indonesia' is not present in the map");
//        }

        for (Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey() + " ");
            System.out.print(e.getValue() + " ");
        }

        // just for keys
        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key);
        }
    }
}

package Hashmap;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class HashSet {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("USA", 130);
        map.put("China", 125);
        System.out.println(map);

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key + " " + map.get(key));
        }
    }
}

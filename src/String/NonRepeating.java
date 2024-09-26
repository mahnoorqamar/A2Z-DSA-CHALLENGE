package String;

import java.util.HashMap;

public class NonRepeating {

    public static char findFirstNonRepeating(String s){
        HashMap<Character, Integer> charCount = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            charCount.put(s.charAt(i), charCount.getOrDefault(s.charAt(i) , 0) +1);
        }

        for(int i = 0; i < s.length(); i++){
            if(charCount.get(s.charAt(i)) == 1){
                return s.charAt(i);
            }
        }

        return '\0';
    }
}

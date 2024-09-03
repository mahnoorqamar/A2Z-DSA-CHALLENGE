package Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class PangramSentence {

    public static boolean pangramSentence(String sentence){
        Set<Character> unique = new HashSet<>();

        for(char c : sentence.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                unique.add(c);
            }
        }

        return unique.size() == 26;
    }
}

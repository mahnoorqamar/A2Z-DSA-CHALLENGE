package ZLast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A1UncommonWords {
    public static void main(String[] args) {

    }

    public static List<String> findUncommonWords(String s1, String s2){
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for(String word : words1){
            wordCount.put(word, wordCount.getOrDefault(word, 0) +1);
        }
        for(String word : words2){
            wordCount.put(word, wordCount.getOrDefault(word, 0) +1);
        }
        List<String> uncommonWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                uncommonWords.add(entry.getKey());
            }
        }

        return uncommonWords;
    }
}

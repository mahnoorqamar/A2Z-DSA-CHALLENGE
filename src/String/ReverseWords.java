package String;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {

    }

    public static String reverseWords(String s){
        String[] words = s.trim().split("\\s+");

        String result = "";
        for(int i = words.length -1; i >=0; i--){
            result += words[i];

            if(i > 0){
                result += " ";
            }
        }

        return result;
    }
}

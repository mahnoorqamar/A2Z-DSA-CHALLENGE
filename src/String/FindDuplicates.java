package String;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        String s = "Namem";

    }

    public static void findDuplicates(String s){
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicate = new HashSet<>();

        for(char c : s.toCharArray()){
            if(!seen.add(c)){
                duplicate.add(c);
            }
        }

        System.out.println(duplicate);
    }
}

package Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public String getFrequency(String str){
        int[] freq = new int[26];

        for(char c : str.toCharArray()){
            freq[c - 'a']++;
        }

        StringBuilder frequencyString = new StringBuilder(" ");

        char c = 'a';
        for(int i : freq){
            frequencyString.append(c);
            frequencyString.append(i);
            c++;
        }

        return frequencyString.toString();
    }


    public List<List<String>> groupAnagrams(String[] strs){
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }

        Map<String, List<String>> frequencyStringMap = new HashMap<>();

        for(String str : strs){
            String frequencyString = getFrequency(str);

            if(frequencyStringMap. containsKey(frequencyString)){
                frequencyStringMap.get(frequencyString).add(str);
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(str);
                frequencyStringMap.put(frequencyString, strList);
            }
        }

        return new ArrayList<>(frequencyStringMap.values());

    }
}

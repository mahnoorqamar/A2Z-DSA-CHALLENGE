package ZLast;

import java.util.HashMap;

public class A2LongestSubString {
    public static void main(String[] args) {

    }

    public static int lengthOfLongestSubstring(String s){
        HashMap<Character, Integer> mpp = new HashMap<Character, Integer>();
        int left = 0;
        int right = 0;
        int n = s.length();
        int len = 0;

        while(right < n){
            if (mpp.containsKey(s.charAt(right))) left = Math.max(mpp.get(s.charAt(right)) + 1, left);

            mpp.put(s.charAt(right), right);

            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
}

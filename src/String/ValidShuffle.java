package String;

public class ValidShuffle {
    public boolean isValidShuffle(String s1, String s2, String s3) {
        // Check if the length of s3 is equal to the sum of lengths of s1 and s2
        if (s3.length() != s1.length() + s2.length()) {
            return false;
        }

        int i = 0, j = 0;
        for (char c : s3.toCharArray()) {
            if (i < s1.length() && c == s1.charAt(i)) {
                i++;
            } else if (j < s2.length() && c == s2.charAt(j)) {
                j++;
            } else {
                return false;
            }
        }

        // If both pointers have traversed their respective strings completely
        return i == s1.length() && j == s2.length();
    }
}

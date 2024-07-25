package String;

public class PallindromeString {
    public static void main (String[] args){
        String s = "AM A MA";
        System.out.println(isPallindrome(s));
    }

    static boolean isPallindrome(String s){
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length -1;

        while (left < right){
            if (charArray[left] != charArray[right]){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

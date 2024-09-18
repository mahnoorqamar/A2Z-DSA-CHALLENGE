package String;

public class PallindromeString2 {
    public static void main(String[] args) {
        String s = "abbab";
        System.out.println(isPallindrome(s));
    }

    public static boolean isPallindrome(String s){
        int left = 0;
        int right = s.length() -1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            left ++;
            right--;
        }

        return true;
    }
}

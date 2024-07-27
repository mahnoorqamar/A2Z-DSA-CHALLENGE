package Recursion;

public class Pallindrone {
    public static void main(String[] args) {

    }

    static boolean isPalindrome(int i, int n, String s) {
        if (i >= n / 2) {
            return true;
        }

        if (s.charAt(i) != s.charAt(n - 1 - i)) {
            return false;
        }

        return isPalindrome(i + 1, n, s);
    }
}

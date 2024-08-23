package LogicBuildng;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(Pallindrome("MAAAM"));

    }

    public static boolean Pallindrome(String s){
        StringBuilder sc = new StringBuilder(s);
        String reversed = sc.reverse().toString();
        return sc.equals(s);
    }
}

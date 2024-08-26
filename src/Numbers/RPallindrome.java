package Numbers;

public class RPallindrome {
    public static void main(String[] args) {
        int num = 121;

    }

    public static boolean Pallindrome(int num){
        int dup = 0;
        int reverseNumber = 0;
        int lastDigit;
        while(num > 0){
            lastDigit = num % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            num = num / 10;
        }

        if (dup == reverseNumber){
            return true;
        } else {
            return false;
        }
    }
}

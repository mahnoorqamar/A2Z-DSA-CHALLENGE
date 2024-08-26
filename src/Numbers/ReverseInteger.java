package Numbers;

public class ReverseInteger {
    public static void main (String[] args){
        int num = 87495;
        int reverseNumber = 0;
        int lastDigit;
        while(num > 0){
            lastDigit = num % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            num = num / 10;
        }

        System.out.println(reverseNumber);


    }
}

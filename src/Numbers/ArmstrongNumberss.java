package Numbers;

public class ArmstrongNumberss {
    public static void main(String[] args) {
        int num = 153;
        boolean result = ArmstrongNumbers(num);
        System.out.println(result);
    }

    public static boolean ArmstrongNumbers(int num){
        int check = num;
        int lastDigit = 0;
        int sum = 0;
        while(num > 0){
            lastDigit = num % 10;
            sum = sum + (lastDigit * lastDigit * lastDigit);
            num = num / 10;
        }

        return sum == check;
    }
}

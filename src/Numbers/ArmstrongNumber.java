package Numbers;

public class ArmstrongNumber {
    public static void main (String [] args){
        int numbr = 371;
        System.out.println(ArmstrongNumber(numbr));
    }

    public static boolean ArmstrongNumber(int N){
        int originalNumber = N;
        int numDigits = 0;
        int temp = N;

        while (temp > 0){
            temp /= 10;
            numDigits++;
        }

        int sum = 0;
        temp = originalNumber;
        while (temp > 0){
            int lastDigit = temp % 10;
            int digitPower = 1;

            for (int i = 0; i < numDigits; i++){
                digitPower *= lastDigit;
            }

            sum += digitPower;
            temp /= 10;
        }

        return sum == originalNumber;
    }
}

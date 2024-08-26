package Numbers;

public class RCountDigits {
    public static void main(String[] args) {
        int num = 34567;
        countDigits(num);

    }

    public static int countDigits(int num){

        // Base case: when the number is a single digit
        if (num < 10) {
            System.out.println(num);  // Print the digit
            return 1;  // Return 1 because this is a single digit
        }

        // Recursive call to process the number except the last digit
        int count = countDigits(num / 10);

        // Print the last digit
        System.out.println(num % 10);

        // Return the cumulative count
        return count + 1;
    }
}

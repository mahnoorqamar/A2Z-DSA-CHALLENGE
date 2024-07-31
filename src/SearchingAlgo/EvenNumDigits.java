package SearchingAlgo;

public class EvenNumDigits {
    public static void main(String[] args) {
        int arr[] = {12, 345, 2, 6, 7896};
    }

        static boolean findNumbers(int[] nums) {
        for (int num : nums) {
            int numberOfDigits = digits(num);
            if (numberOfDigits % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    // count number of digits in a number
    static int digits(int num){
        int count = 0;

        while (num > 0){
            count++;
            num = num/10;
        }

        return count;
    }


}

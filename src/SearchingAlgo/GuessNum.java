package SearchingAlgo;

public class GuessNum {
    private static int pickedNumber;

    public static void main(String[] args) {
        // Test the function
        pickedNumber = 7; // Assume the number to be guessed is 7
        System.out.println(guessNumber(10)); // Output should be 7
    }

    static int guess(int num) {
        if (num == pickedNumber) {
            return 0;
        } else if (num > pickedNumber) {
            return -1;
        } else {
            return 1;
        }
    }

    static int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int result = guess(mid);
            if (result == 0) {
                return mid;
            } else if (result < 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1; // This should never be reached
    }
}

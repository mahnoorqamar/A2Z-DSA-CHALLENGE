package BitManipulation;

public class CountBit {
    public static int countOnes(int number) {
        int count = 0;

        while (number != 0) {
            // Increment count for each 1 found
            count += (number & 1);
            // Right shift the number by 1 bit
            number >>= 1;
        }

        return count;
    }
}

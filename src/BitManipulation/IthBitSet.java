package BitManipulation;

public class IthBitSet {
    public static boolean isIthBitSet(int number, int i) {
        // Create a bitmask by left shifting 1 by i positions
        int bitmask = 1 << i;

        // Perform bitwise AND and check if the result is non-zero
        return (number & bitmask) != 0;
    }
}

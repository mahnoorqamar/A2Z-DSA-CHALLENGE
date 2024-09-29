package BitManipulation;

public class CheckIthBit {
    public static void main(String[] args) {
        int number = 29; // Example number
        int bitPosition = 3; // Example bit position to check

        boolean isBitSet = isBitSet(number, bitPosition);
        System.out.println("Is the " + bitPosition + "th bit set in " + number + "? " + isBitSet);
    }

    public static boolean isBitSet(int number, int position){
        return (number & (1 << position)) != 0;
    }
}

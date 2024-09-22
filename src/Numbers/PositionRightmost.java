package Numbers;

public class PositionRightmost {
    public static int findRightMostSetBitPosition(int num) {
        if (num == 0) return -1; // No set bit in zero

        int position = 1; // Position is 1-based
        int mask = num & -num; // Isolate the rightmost set bit

        while ((mask >>= 1) != 0) {
            position++;
        }

        return position;
    }

}

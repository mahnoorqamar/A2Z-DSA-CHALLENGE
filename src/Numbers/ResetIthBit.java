package Numbers;

public class ResetIthBit {
    public static void main(String[] args) {

    }

    static int reset(int num, int i){
        // Create a mask with a 0 at the ith position (1 << i) and invert it using ~
        int mask = ~(1 << i);
        // Perform bitwise AND with the number and the mask to reset the ith bit
        return num & mask;
    }
}

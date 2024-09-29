package BitManipulation;

public class NofBitsTobeFlipped {
    public static int countBitsToFlip(int A, int B){
        return Integer.bitCount(A ^ B);
    }
}

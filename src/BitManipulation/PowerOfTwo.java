package BitManipulation;

public class PowerOfTwo {
    public static boolean isPOwerOfTwo(int n){
        return n > 0 && (n & (n -1)) == 0;
    }
}

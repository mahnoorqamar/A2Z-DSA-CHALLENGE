package Arrays;

public class SingleNoTwice {
    public static void main(String[] args) {

    }

    public static int singleNumber(int[] arr) {
        int result = 0;
        for(int i : arr){
            result ^= i;
        }
        return result;

    }
}

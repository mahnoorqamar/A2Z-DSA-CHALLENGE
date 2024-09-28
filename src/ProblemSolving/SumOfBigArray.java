package ProblemSolving;

import java.util.List;

public class SumOfBigArray {
    public static void main(String[] args) {
        List<Long> ar = List.of(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L);
        long result = aVeryBigSum(ar);
    }
    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (long s : ar){
            sum+= s;
        }

        return sum;

    }
}

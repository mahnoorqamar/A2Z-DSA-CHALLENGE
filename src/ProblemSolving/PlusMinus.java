package ProblemSolving;

import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int positiveCount = 0; // Count of positive numbers
        int negativeCount = 0; // Count of negative numbers
        int zeroCount = 0;     // Count of zeros

        int totalCount = arr.size(); // Total number of elements

        // Iterate through the array and count positive, negative, and zero elements
        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // Calculate ratios
        double positiveRatio = (double) positiveCount / totalCount;
        double negativeRatio = (double) negativeCount / totalCount;
        double zeroRatio = (double) zeroCount / totalCount;

        // Print results with six decimal places
        System.out.printf("%.6f%n", positiveRatio);
        System.out.printf("%.6f%n", negativeRatio);
        System.out.printf("%.6f%n", zeroRatio);
    }


}

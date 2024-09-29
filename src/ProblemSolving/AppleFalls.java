package ProblemSolving;

import java.util.List;

public class AppleFalls {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int appleCount = 0;
        int orangeCount = 0;

        // Count apples that fall on the house
        for (int apple : apples) {
            int applePosition = a + apple; // Calculate where the apple falls
            if (applePosition >= s && applePosition <= t) {
                appleCount++;
            }
        }

        // Count oranges that fall on the house
        for (int orange : oranges) {
            int orangePosition = b + orange; // Calculate where the orange falls
            if (orangePosition >= s && orangePosition <= t) {
                orangeCount++;
            }
        }

        // Print the result
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

}

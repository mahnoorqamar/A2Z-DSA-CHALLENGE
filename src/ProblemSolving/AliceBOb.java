package ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class AliceBOb {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Initialize scores
        int aliceScore = 0;
        int bobScore = 0;

        // Loop through each category (0, 1, 2)
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++; // Alice earns a point
            } else if (a.get(i) < b.get(i)) {
                bobScore++;   // Bob earns a point
            }
        }

        // Create a list to hold the scores and return it
        List<Integer> scores = new ArrayList<>();
        scores.add(aliceScore);
        scores.add(bobScore);
        return scores;

    }
}

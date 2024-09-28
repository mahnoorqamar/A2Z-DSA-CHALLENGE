package ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class AliceBOb {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
//        If a[i] > b[i], then Alice is awarded 1 point.
//        If a[i] < b[i], then Bob is awarded 1 point.
//        If a[i] = b[i], then neither person receives a point.

        int aliceScore = 0;
        int bobScore = 0;

        for(int i = 0; i < 3; i++){
            if(a.get(i) > b.get(i)){
                aliceScore++;
            } else if (a.get(i) < b.get(i)) {
                bobScore++;
            }
        }

        return new ArrayList<>(aliceScore, bobScore);
    }
}

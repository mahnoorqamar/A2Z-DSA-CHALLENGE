package ProblemSolving;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr){
        int primaryDiagonalSum = 0;
        int secondaryDigonalSum = 0;
        int n = arr.size();

        for(int i = 0; i < n ; i++){
            primaryDiagonalSum += arr.get(i).get(i);
            secondaryDigonalSum += arr.get(i).get(n-1-i);
        }

        return Math.abs(primaryDiagonalSum - secondaryDigonalSum);
    }
}

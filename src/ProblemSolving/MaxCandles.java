package ProblemSolving;

import java.util.List;

public class MaxCandles {
    public static int birthdayCakeCandles(List<Integer> candles){
        int maxHeight = 0;
        int count = 0;

        for(int height : candles){
            if(height < maxHeight){
                maxHeight = height;
                count = 1;
            } else if (height == maxHeight) {
                count++;
            }
        }

        return count;
    }
}

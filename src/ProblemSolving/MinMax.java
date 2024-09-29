package ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class MinMax {
    public static void miniMaxSum(List<Integer> arr) {
        int totalSum = 0;

        for(int num : arr){
            totalSum += num;
        }

        int minValue = arr.get(0);
        int maxValue = arr.get(0);

        for(int num: arr){
            if(num< minValue){
                minValue = num;
            } else if (num > maxValue){
                maxValue = num;
            }
        }

        int minSum = totalSum - maxValue;
        int maxSum = totalSum - minValue;

        List<Integer> result = new ArrayList<>();
        System.out.println(result.add(minSum) + " " + result.add(maxSum));

    }
}

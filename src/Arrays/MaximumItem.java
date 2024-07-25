package Arrays;

import java.util.Arrays;

public class MaximumItem {
    public static void main (String[] args){
        int[] arr = {8, 6, 2, 7, 4};
        System.out.println(max(arr));
        System.out.println(maxInRange(arr, 2, 4));



    }
    public static int max (int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int maxInRange (int[] arr, int start, int end){
        int max = arr[start];
        for (int i = start; i <= end; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(reverseString(s));
    }

    public int maxSumSubarray(int[] nums, int k) {
        if (nums.length < k) {
            throw new IllegalArgumentException("Array length is less than the size of the window.");
        }

        int maxSum = 0;
        int windowSum = 0;

        // Compute the sum of the first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;

        // Slide the window across the array
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static String reverseString(String s){
        int start = 0;
        int end = s.length() -1;

        char[] string = s.toCharArray();;

        while(start < end){
            char temp = string[start];
            string[start] = string[end];
            string[end] = temp;

            start++;
            end--;

        }

        return new String(string);
    }


}
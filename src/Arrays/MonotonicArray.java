package Arrays;

public class MonotonicArray {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 5, 1};
        System.out.println(isMonotonic(arr));
    }

    public static boolean isMonotonic(int[] nums){
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 1; i < nums.length ; i ++){
           if (nums[i] < nums[i - 1]){
               isDecreasing = false;
           }
           if (nums[i] > nums[i -1]){
               isIncreasing = false;
           }
        }
        return isIncreasing || isDecreasing;
    }
}

package Arrays;

public class ArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n]; // Initialize result array

        for (int i = 0; i < n; i++) {
            result[i] = nums[nums[i]]; // Reorder elements based on pattern
        }

        return result;
    }

    public static int[] permutationArray(int[] arr){
        int[] result = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            result[i] = arr[arr[i]];
        }

        return result;
    }
}

package Arrays;

public class SortColours {

    class Solution {
        public void sortColors(int[] nums) {
            int low = 0;
            int high = nums.length - 1;
            int mid = 0;

            while (mid <= high) {
                if (nums[mid] == 0) {
                    swap(nums, low, mid);  // Swap using indices, not values
                    low++;
                    mid++;
                } else if (nums[mid] == 1) {
                    mid++;  // Just move mid when it's 1
                } else {
                    swap(nums, mid, high);  // Swap mid with high when it's 2
                    high--;  // Decrement high after placing 2 at the correct position
                }
            }
        }

        // Swap method takes indices and swaps values in the array
        public void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }


}

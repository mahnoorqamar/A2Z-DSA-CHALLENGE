package Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSubArrayGIvenSum {

    // Bruteforce
    public int countSubarraysWithSumBruteForce(int[] nums, int targetSum) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                if (currentSum == targetSum) {
                    count++;
                }
            }
        }

        return count;
    }


    // Hashmap
    public int countSubarraysWithSum(int[] nums, int targetSum) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        int count = 0;
        int currentSum = 0;

        // Initialize with sum 0 having one occurrence (to handle subarrays starting from index 0)
        sumMap.put(0, 1);

        for (int num : nums) {
            currentSum += num;

            // Check if there is a subarray with sum equal to (currentSum - targetSum)
            if (sumMap.containsKey(currentSum - targetSum)) {
                count += sumMap.get(currentSum - targetSum);
            }

            // Update the frequency of the current sum in the hashmap
            sumMap.put(currentSum, sumMap.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

}

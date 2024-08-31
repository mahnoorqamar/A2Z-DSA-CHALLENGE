package Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

    }

    // bruteforce
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        int longestStreak = 1;

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int currentStreak = 1;

            // Check for the next consecutive numbers
            while (contains(nums, currentNum + 1)) {
                currentNum += 1;
                currentStreak += 1;
            }

            // Update the longest streak found so far
            longestStreak = Math.max(longestStreak, currentStreak);
        }

        return longestStreak;
    }

    private boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

}

import java.util.Arrays;
public class RandomPractice {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 11, 15};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] nums, int target){
        int[] result;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j +1; k< nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == target){
                        return new int[]{i, j, k};
                    }
                }
            }
        }
        return new int[] {-1, -1, -1};
    }
}

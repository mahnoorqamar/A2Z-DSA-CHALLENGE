package Arrays;

public class SignOfProductOfAnArray {
    public static void main(String[] args) {
        int[] nums1 = {1, -2, -3, 4};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 2, 0, 4};
        int[] nums4 = {1, -2, -6, -4};

        System.out.println(arraySign(nums1));
        System.out.println(arraySign(nums2));
        System.out.println(arraySign(nums3));
        System.out.println(arraySign(nums4));
    }

    public static int arraySign(int[] nums){
        int negativeCount = 0;

        for (int i : nums){
            if (i == 0){
                return 0;
            }
            if (i < 0){
                negativeCount++;
            }
        }

        return (negativeCount % 2 == 0) ? 1 : -1;
    }
}

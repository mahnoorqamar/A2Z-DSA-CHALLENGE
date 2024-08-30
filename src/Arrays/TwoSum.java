package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 14;

        System.out.println(twoSum(arr, target));

    }

    public static boolean twoSum(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    continue;
                } if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }

        return false;
    }
}

package ZLast;
import java.util.Arrays;
public class DTwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 14;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum (int [] arr, int target){
        for(int i = 0; i < arr.length; i++){
           for(int j = i +1; j < arr.length; j++){
               if(arr[i] + arr[j] == target){
                   return new int[] {i, j};
               }
           }
        }

        return new int[] {-1, -1};
    }
}

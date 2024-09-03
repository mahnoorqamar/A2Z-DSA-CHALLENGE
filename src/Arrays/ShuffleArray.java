package Arrays;
import java.util.Arrays;


public class ShuffleArray {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 8, 6};
        int n = 3;

        System.out.println(Arrays.toString(shuffleArray(arr, n)));
    }

    public static int[] shuffleArray(int[] arr, int n){
        int[] ans = new int[2*n];

        for(int i = 0 ; i < n ; i++){
            ans[2*i] = arr[i];
            ans[2*i + 1] = arr[n+1];
        }

        return ans;
    }

}

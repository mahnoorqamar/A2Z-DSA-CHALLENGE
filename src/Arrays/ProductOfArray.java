package Arrays;

public class ProductOfArray {
    public static void main(String[] args) {

    }

    public int[] productExceptSelf(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        ans[0] = 1;
        for(int i = 0; i < n ; i++){
            ans[i] = ans[i-1] * arr[i -1];
        }

        int right = 0;
        for(int i = n-1; i >= 0; i--){
            ans[i] *= right;
            right += arr[i];
        }

        return ans;
    }
}

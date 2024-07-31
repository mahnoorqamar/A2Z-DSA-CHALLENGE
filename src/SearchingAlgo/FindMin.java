package SearchingAlgo;

public class FindMin {
    public static void main(String[] args) {

    }

    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[ans]){
                ans = arr[i];
            }
        }
        return ans;
    }
}

package SearchingAlgo.BinarySearch;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] arr = {4, 7, 7, 7, 7, 8, 9, 10};

    }

    public static int[] firstLast(int[] arr, int target){
        int[] ans = {-1, -1};
        int start = BS(arr, target, true);
        int end = BS(arr, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    public static int BS(int[] arr, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;
            } else {
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                } else{
                    start  = mid + 1;
                }
            }
        }

        return ans;
    }
}

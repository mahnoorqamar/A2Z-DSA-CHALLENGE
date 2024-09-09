package SearchingAlgo.BinarySearch;

public class BInarySearchArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 5, 6, 8};
        int target = 5;
        System.out.println(search(arr, target));
    }


    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid -1;
            } else if (target > nums[mid]) {

                start = mid+1;
            } else {
                return mid;
            }
        }

        return -1;

    }
}

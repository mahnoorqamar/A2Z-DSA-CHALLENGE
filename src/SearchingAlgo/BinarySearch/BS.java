package SearchingAlgo.BinarySearch;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 10, 15};
        int target = 7;

        System.out.println(binarySearch(arr, target));
    }

    public static int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;
            } else {
                return mid;
            }
        }

        return -1;
    }


}

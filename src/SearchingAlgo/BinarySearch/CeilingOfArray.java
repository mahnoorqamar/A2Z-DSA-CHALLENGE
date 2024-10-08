package SearchingAlgo.BinarySearch;

public class CeilingOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8, 9};
        int target = 6;

        System.out.println(ceiling(arr, target));
    }
    public static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start) /2;
            if(target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;
            } else{
                return mid;
            }

        }

        return start;
    }


}

package SearchingAlgo.BinarySearch;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8, 9};
        int target = 6;
        System.out.println(floorFind(arr, target));
    }

    public static int floorFind(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) /2;
            if(target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;
            } else {
                return mid;
            }
        }

        return end;
    }

}

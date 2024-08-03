package SearchingAlgo;

public class Sqrt {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 9, 12, 15, 87};
        int result = binarySearch(3, arr);
        System.out.println(result);
    }

    static int mySqrt(int x) {
        if (x == 0){
            return 0;
        }

        int start = 1;
        int end = x;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid * mid == x){
                return mid;
            } else if (mid * mid < x){
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }

        return start;
    }

    static int binarySearch(int target, int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

package SearchingAlgo.BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8, 9};
        int element = 7;
        System.out.println(searchPosition(arr, element));

    }

    public static int searchPosition(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}

package Arrays;

public class SortingArrayOfZOT {
    public static void main(String[] args) {

    }

    public static void sortArray(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;  // Corrected the high index

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;  // Just move the mid pointer
            } else {  // arr[mid] == 2
                swap(arr, mid, high);
                high--;  // Decrease the high pointer
            }
        }
    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}

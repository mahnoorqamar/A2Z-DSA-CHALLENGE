package SortingTechniques;

public class SelectingSort {
    public static void main(String[] args) {

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the maximum item and swap with correct

            int last = arr.length -i -1;
            int maximum = getMaxIndex(arr, 0, last);

            swap(arr, maximum, last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end ; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

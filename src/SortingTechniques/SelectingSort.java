package SortingTechniques;

public class SelectingSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length; // Calculate the size of the array
        selectionSort(arr, n);

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) { // Outer loop for traversing the array
            int min = i; // Initialize min to the current index i
            for (int j = i + 1; j < n; j++) { // Start j from i + 1 to n
                if (arr[j] < arr[min]) {
                    min = j; // Update min if a smaller element is found
                }
            }
            // Swap the found minimum element with the element at index i
            if (min != i) {
                swap(arr, i, min); // Pass indices to the swap function
            }
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

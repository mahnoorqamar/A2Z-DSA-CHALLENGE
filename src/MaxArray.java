public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {7, 6, 7, 3, 12, 5};
        int maxValue = max(arr); // Call the max method and store the result
        System.out.println("The maximum value in the array is: " + maxValue);
    }

    // Define a static method to find the maximum value in the array
    public static int max(int[] arr) {
        // Initialize max with the minimum possible integer value
        int max = Integer.MIN_VALUE;
        // Iterate over the array to find the maximum value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger value is found
            }
        }
        return max; // Return the maximum value
    }
}

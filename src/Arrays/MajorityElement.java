package Arrays;

public class MajorityElement {
    public static void main(String[] args) {

    }

    public static int majority(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return arr[i];
            }
        }

        // If no majority element is found
        return -1; // You can return any value here or throw an exception if preferred
    }
}

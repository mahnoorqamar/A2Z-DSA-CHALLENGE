package SearchingAlgo;

import java.util.ArrayList;

public class MovingZeroesToTheEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 2, 4, 5, 0, 4};
        int n = arr.length; // Use the full length of the array
        int[] ans = moveZeroes(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }

    public static int[] moveZeroes(int[] arr, int n) {
        ArrayList<Integer> temp = new ArrayList<>();

        // Copy non-zero elements from the original array to the temp array:
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        // Copy elements from temp back to the original array:
        int nz = temp.size();
        for (int i = 0; i < nz; i++) {
            arr[i] = temp.get(i);
        }

        // Fill the remaining positions with zeroes:
        for (int i = nz; i < n; i++) {
            arr[i] = 0;
        }

        return arr;
    }
}

package Arrays;

public class Convert1Dto2D {


    public int[][] construct2DArray(int[] original, int m, int n) {
        // Check if the transformation is possible
        if (m * n != original.length) {
            return new int[0][0]; // Return an empty 2D array if sizes don't match
        }

        int[][] res = new int[m][n];

        // Fill the 2D array with elements from the original array
        for (int i = 0; i < original.length; i++) {
            res[i / n][i % n] = original[i];
        }

        return res;
    }

}

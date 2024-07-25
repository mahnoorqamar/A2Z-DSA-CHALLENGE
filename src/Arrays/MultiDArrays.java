package Arrays;
import java.util.Scanner;

public class MultiDArrays {
    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[3][3];

    public MultiDArrays() {
        for(int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        for(int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]);
            }
        }
    }

    // You can add other methods here if needed
}

package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class InputOutput2DArray {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int row = 3;
        int col = 3;

        int [][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0 ; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}

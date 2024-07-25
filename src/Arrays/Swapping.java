package Arrays;
import java.util.Arrays;
public class Swapping {
    public static void main (String[] args){
        int[] arr = {8, 6, 2, 7, 4};
        swap(arr, 0, 1);
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

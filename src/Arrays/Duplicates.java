package Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 3, 2};
        int result = removeDuplicates(arr, 0);
        System.out.println(result);
    }

    public static int removeDuplicates(int[] arr, int n){
        int i = 0;
        for (int j = 1; j < n; j++){
            if (arr[i] != arr[j]){
                arr[i +1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}

package Arrays;
import java.util.Arrays;
public class GreatestAmong {
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallestNum(arr)));

    }

    public static int[] smallestNum(int[] arr){
        int[] result = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    count++;
                }
            }

            result[i] = count;
        }

        return result;
    }
}

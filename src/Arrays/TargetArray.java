package Arrays;

import java.util.ArrayList;
import java.util.List;

public class TargetArray {
    public static void main(String[] args) {

    }

    public static int[] targetArray(int[] arr, int [] index){
        List<Integer> target = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            target.add(index[i], arr[i]);
        }

        int[] result = new int[target.size()];
        for(int i : result){
            result[i] = target.get(i);
        }

        return result;
    }
}

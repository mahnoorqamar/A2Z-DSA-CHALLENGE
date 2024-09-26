package Arrays;

import java.util.ArrayList;

public class ReturnDuplicate {
    public static ArrayList<Integer> duplicates(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n];
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }

        for(int i = 0; i < arr.length; i++){
            if(freq[i] > 1){
                result.add(i);
            }
        }

        if(result.isEmpty()){
            result.add(-1);
        }

        return result;

    }
}

package Arrays;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 6, 6};
        int k = removeDuplicates(arr);
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int removeDuplicates(int[] arr){
        HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            arr[j++] = x;
        }
        return k;
    }

    public static int removeDuplicate(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }

        return i +1;
    }


}

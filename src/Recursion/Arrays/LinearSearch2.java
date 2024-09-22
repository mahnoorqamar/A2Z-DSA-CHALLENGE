package Recursion.Arrays;

public class LinearSearch2 {
    static boolean search(int [] arr, int target, int index){
        if(index == arr.length -1){
            return false;
        }

        return target == arr[index] || search(arr, target, index+1);
    }
}

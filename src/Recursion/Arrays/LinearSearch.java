package Recursion.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 10, 15};
        System.out.println(search(arr, 9, 0));
    }

    static boolean search(int [] arr, int target, int index){
        if(index == arr.length -1){
            return false;
        }

        return target == arr[index] || search(arr, target, index+1);
    }

}

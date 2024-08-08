package Recursion;

public class LinearSearch {
    public static void main(String[] args) {

    }

    static int find(int[] arr, int index, int target){
        if (index == arr.length){
            return -1;
        }

        if (arr[index] == target){
            return index;
        } else {
            return find(arr, target, index+1);
        }

    }
}

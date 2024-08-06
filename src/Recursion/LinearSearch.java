package Recursion;

public class LinearSearch {
    public static void main(String[] args) {

    }

    static boolean find(int[] arr, int index, int target){
        if (index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr, target, index+1);
    }
}

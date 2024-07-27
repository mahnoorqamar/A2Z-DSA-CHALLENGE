package Recursion;

public class SwappingUsingRecursion {
    public static void main(String[] args) {

    }

    static void Swap(int[] arr, int l, int r) {
        if (l >= r){
            return;
        }

        // Swap elements at positions l and r
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        // Recursive call
        Swap(arr, l + 1, r - 1);
    }
}

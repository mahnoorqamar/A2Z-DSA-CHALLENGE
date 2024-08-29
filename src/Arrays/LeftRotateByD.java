package Arrays;

public class LeftRotateByD {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;

        leftRotate(arr, d);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void reverse(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }

    public static void leftRotate(int[] arr, int d){
        int n = arr.length;

        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);


    }
}

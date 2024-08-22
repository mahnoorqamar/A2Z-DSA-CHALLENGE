package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 9, 5, 6, 10};
        System.out.println(largest(arr));

    }

    public static int largest(int[] arr){
        int largest = arr[0];

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}

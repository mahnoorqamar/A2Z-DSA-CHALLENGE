package Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5, 6};
        System.out.println(sorted(arr));
    }

    public static boolean sorted(int [] arr){
        for (int i = 1; i < arr.length ; i++){
            if (arr[i] >= arr[i-1]){

            } else {
                return false;
            }
        }
        return true;
    }
}

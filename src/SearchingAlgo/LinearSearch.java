package SearchingAlgo;

public class LinearSearch {
    public static void main (String[] args){
        int [] arr = {4, 6, 9, 3, 2, 0};
        System.out.println(linearSearch(arr, 5));


    }

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return-1;
        }
        for (int i = 0; i < arr.length ; i++){
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }
}

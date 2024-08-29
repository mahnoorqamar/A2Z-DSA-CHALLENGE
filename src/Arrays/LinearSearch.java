package Arrays;

public class LinearSearch {
    public static void main(String[] args) {

    }

    public static int linearSearch(int [] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i < arr.length; i++){
            int element = arr[i];
            if(element == target){
                return target;
            }
        }
        return -1;
    }
}

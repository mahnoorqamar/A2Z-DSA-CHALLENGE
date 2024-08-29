import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }

    public static void printN(int num){
        if(num > 0){
            System.out.println(num);
            return;
        }

        printN(num);
        num++;
    }

    public static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i <= arr.length; i++){
            if(arr[i] == target){
                target = arr[i];
            }
            System.out.println(target);
        }

        return -1;
    }

    public static int[] reverseArray(int [] arr){
        int[] reversed = new int[arr.length];
        int end = arr.length -1;

        for(int i = 0; i < arr.length; i++){
            reversed[i] = arr[end];
            end--;
        }
        return reversed;

    }



}
import java.util.Scanner;
import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        int [] arr = {7, 5, 4, 6, 2, 9, 3, 8};
        swap(arr, 2, 4);
        System.out.println(arr);


    }

    static void swap (int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

}


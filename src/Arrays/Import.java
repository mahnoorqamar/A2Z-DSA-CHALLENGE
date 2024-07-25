package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Import {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];

//        for (int i = 0; i < arr.length ; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < arr.length ; i++){
//            System.out.print(arr[i] + " ");
//        }

//        for (int i : arr){
//            arr[i] = sc.nextInt();
//        }
//
//        for (int i : arr){
//            System.out.println(arr[i] + " ");
//        }

        String [] str = new String[4];

        for (int i = 0; i < str.length; i++){
            str[i] = sc.next();
        }

        System.out.print(Arrays.toString(str));

    }
}
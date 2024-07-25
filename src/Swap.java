import java.util.Arrays;

public class Swap {
    public static void main(String[] args){
        int [] array = {1, 5, 8, 9, 3, 7, 2};
        swap(array, 1, 2);

        System.out.println(Arrays.toString(array));

    }

    static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}

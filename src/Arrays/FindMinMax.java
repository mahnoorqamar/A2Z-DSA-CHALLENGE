package Arrays;

public class FindMinMax {
    public static void main(String[] args) {
        int [] arr = {4, 6, 9, 3, 2, 0};
        findMinMax(arr);
    }

    public static void findMinMax(int [] arr){
        if (arr.length == 0 ){
            return;
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}

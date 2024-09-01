package Arrays;

public class RunningSum {
    public static int[] runningSumm(int[] arr){
        for(int i = 1 ; i < arr.length; i++){
            arr[i] += arr[i -1];
        }

        return arr;
    }
}

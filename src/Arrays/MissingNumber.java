package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};

    }

    public static int missingNumber(int [] arr) {
        int N = arr.length -1;
        //Summation of first N numbers:
        int sum = (N * (N + 1)) / 2;

        //Summation of all array elements:
        int s2 = 0;
        for (int i = 0; i < N - 1; i++) {
            s2 += arr[i];
        }

        int missingNum = sum - s2;
        return missingNum;
    }

    static int missing(int[]arr){
        int n = arr.length;

        int sum = (n*(n + 1)) / 2;

        int sum2 = 0;
        for(int i = 0 ; i < arr.length -1; i++){
            sum2 += arr[i];
        }

        int missingnum = sum - sum2;
        return missingnum;
    }
}


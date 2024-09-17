package ZLast;

public class CRemoveDuplicates {
    public static void main(String[] args) {
        int[] arr= {2, 5, 5, 8, 9, 9, 10};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] arr){
        int k = 1;
        for(int i = 1; i < arr.length; i++){
            if (arr[i] != arr[i-1]){
                arr[k] = arr[i];
                k++;
            }
        }

        return k;
    }
}

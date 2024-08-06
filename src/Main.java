public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 8, 6, 9, 10, 55};
        System.out.println(max(arr));

    }

    static boolean max(int[] arr){
        int max = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return false;
    }
}
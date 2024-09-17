package ZLast;

public class BRemoveElements {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 2, 6, 8, 7};
        int val = 2;
        System.out.println(removeElement(arr, val));
    }

    public static int removeElement(int[] arr, int val){
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != val){
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
}

package ZLast;

public class ESingleNumber {
    public static void main(String[] args){
        int [] arr= {2, 4, 4, 5, 5, 6, 6, 6};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] arr){
        int result = 0;
        for(int i : arr){
            result ^= i;
        }

        return result;
    }
}

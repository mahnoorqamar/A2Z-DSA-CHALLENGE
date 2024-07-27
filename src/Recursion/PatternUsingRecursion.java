package Recursion;

import java.util.List;
public class PatternUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int n = arr.length;
        int sum = 2;
        List<Integer> ds = new ArrayList<>();
        printS(0, ds, 0, sum, arr, n);
    }

    static void printS(int index, List<Integer> ds, int s, int sum, int[] arr, int n){
        if (index == n) {
            if (s == sum) {
                for (int i : ds) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            return;
        }

        ds.add(arr[index]);
        printS(index + 1, ds, s + arr[index], sum, arr, n);

        ds.remove(ds.size() - 1);
        printS(index + 1, ds, s, sum, arr, n);
    }
}

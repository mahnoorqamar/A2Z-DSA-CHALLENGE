package Recursion;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        int n = 8;
        fun(n, 0);
    }

    static void fun(int i, int sum){
        if (i < 1){
            System.out.println(sum);
            return;
        }
         fun(i - 1, sum + i);
    }
}

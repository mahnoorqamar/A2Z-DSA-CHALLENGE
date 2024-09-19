package Recursion.Easy;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(254));
    }

    public static int sumDigits(int n){
        if (n == 0){
            return 0;
        }

        return (n % 10) + sumDigits(n/10);
    }
}

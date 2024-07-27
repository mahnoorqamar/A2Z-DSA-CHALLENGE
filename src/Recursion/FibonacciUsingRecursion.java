package Recursion;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        int n = 4;
        int result = fibonacci(n);
        System.out.println(result);
    }

    static int fibonacci(int n){
        if(n <= 1){
            return n;
        }

        int last = fibonacci(n-1);
        int slast = fibonacci((n -2));

        return last + slast;

    }
}

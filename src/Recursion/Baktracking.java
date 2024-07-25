package Recursion;

public class Baktracking {
    public static void main(String[] args) {
        int n = 5;
        fun(n, n);
    }

    static void fun(int i, int n){
        if(i<1){
            return;
        }

        fun(i-1, n);
        System.out.println(i);
    }
}

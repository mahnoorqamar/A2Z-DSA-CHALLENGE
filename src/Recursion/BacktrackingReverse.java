package Recursion;

public class BacktrackingReverse {
    public static void main(String[] args) {
        int n = 5;
        fun(1, n);
    }

    static void fun(int i, int n){
        if(i > n){
            return;
        }

        fun(i+1, n);
        System.out.println(i);
    }
}

package Recursion;

public class LinearPrint {
    public static void main(String[] args) {
        int n = 10;
        linearPrint(1, n);
    }

    static void linearPrint(int i, int n){
        if (i > n){
            return;
        }

        System.out.println(i*n);
        linearPrint(i + 1, n);

    }
}

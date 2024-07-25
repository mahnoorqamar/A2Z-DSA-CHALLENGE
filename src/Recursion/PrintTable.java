package Recursion;

public class PrintTable {
    public static void main(String[] args) {
        int n = 5;
        table(1, n);
    }

    static void table(int i, int n){
        if (i > 10) return;

        System.out.println( i * n );
        table(i + 1, n);
    }
}

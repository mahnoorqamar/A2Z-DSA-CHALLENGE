package Recursion.Easy;

public class SumOfNNumbers {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    public static int sum(int n){
        if(n <=1){
            return 1;
        }

        return n + (n-1);
    }
}


package Recursion.Easy;

public class NtoNumber {
    public static void main(String[] args) {

    }

    public static void funBoth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);

    }

    public static void funRev(int n){
        if(n == 0){
            return;
        }
        funRev(n-1);
        System.out.println(n);

    }

    public static void fun(int n){
        if(n == 0){
            return;
        }
        fun(n-1);
        System.out.println(n);

    }

    public static void funRevN(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        funRevN(--n);

    }
}

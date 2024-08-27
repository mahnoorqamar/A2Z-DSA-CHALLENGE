import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       printToN(1, 10);
    }

    public static void printN(int num){
        if(num > 0){
            System.out.println(num);
            return;
        }

        printN(num);
        num++;
    }

    public static void printToN(int num, int n2){
        if(num > n2){
            return;
        }

        printToN(num + 1, n2);
        System.out.println(num);
    }



}
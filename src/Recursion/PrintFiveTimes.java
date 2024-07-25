package Recursion;

import java.util.Scanner;

public class PrintFiveTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printNames(1, N);
    }

    static void printNames(int i, int n){
        if (i > n){
            return;
        }

        System.out.println("Mahnoor");
        printNames(i + 1, n);

    }
}

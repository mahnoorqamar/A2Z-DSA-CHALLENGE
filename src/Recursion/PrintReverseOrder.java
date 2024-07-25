package Recursion;

public class PrintReverseOrder {
    public static void main(String[] args) {
        int number = 10;
        reversePrint(number);
    }

    static void reversePrint(int i) {
        if (i < 1) {
            return;
        }

        System.out.println(i);
        reversePrint(i - 1);
    }
}

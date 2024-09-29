package BitManipulation;

public class Swap {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        swap(a, b);
    }
    public static void swap(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a + " " + b);
    }
}

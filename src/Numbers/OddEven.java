package Numbers;

public class OddEven {
    public static void main(String[] args) {
        int num = 68;
        System.out.println(oddEven(num));
    }

    static boolean oddEven(int num){
        return (num & 1) == 1;
    }
}

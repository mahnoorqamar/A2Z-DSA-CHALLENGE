package BitManipulation;

public class OddOrNot {
    public static String checkEvenOdd(int n){
        if((n & 1) == 0){
            return "even";
        } else {
            return "odd";
        }
    }
}

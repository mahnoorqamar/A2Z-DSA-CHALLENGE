package BitManipulation;

public class Operators {
    public static void main(String[] args) {
        System.out.println(AndOperator(13, 7));
    }
    public static int AndOperator(int num1, int num2){
        int result = num1 >> num2;
        return result;
    }
}

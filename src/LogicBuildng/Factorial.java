package LogicBuildng;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static int factorial(int num){
        if (num < 0){
            return -1;
        }

        int factorial =1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
        return factorial;
    }
}

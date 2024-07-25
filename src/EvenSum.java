import java.util.Scanner;

public class EvenSum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(sumEven(N));

    }

    static int sumEven(int N){
        int evenSum = 0;

        for(int i = 0; i <= N ; i++){
            if (i % 2 == 0){
                evenSum += i;
            }
        }

        return evenSum;
    }
}

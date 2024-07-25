import java.util.*;

public class SumN {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumNum(n));
        System.out.println("Sum of even numbers " + evenNumSum(n));
    }

    static int sumNum(int n){
        int sum = 0;

        for (int i = 0; i <= n ; i++){
            sum += i;
        }

        return sum;
    }

    static int evenNumSum(int n){
        int evenSum = 0;

        for (int i = 0; i <= n ; i++){
            if (i % 2 == 0){
                evenSum += i;
            }
        }

        return evenSum;
    }
}

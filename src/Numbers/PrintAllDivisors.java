package Numbers;

public class PrintAllDivisors {
    public static void main (String[] args){
        int n = 12; // Initialize 'n' with a value, for example, 12
        printDivisors(n);


    }

    public static void  printDivisors(int N){
        for (int i = 1; i <= N ; i++){
            if (N % i == 0){
                System.out.println(i);
            }
        }
    }
}

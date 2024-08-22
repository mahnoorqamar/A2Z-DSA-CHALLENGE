public class Main {
    public static void main(String[] args) {
        numbers(10);
    }

    public static void numbers(int n){
        if (n == 0){
            return;
        }


        numbers(n-1);
        System.out.println(n);
    }



}
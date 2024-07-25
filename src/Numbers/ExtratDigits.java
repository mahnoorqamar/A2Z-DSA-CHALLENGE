package Numbers;

import java.util.Scanner;

public class ExtratDigits {
    public static void main (String[] args){
        // Extract the digits
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int lastDigit;
        while(num > 0){
            lastDigit = num % 10;
            System.out.println(lastDigit);
            num = num / 10;
        }
    }
}

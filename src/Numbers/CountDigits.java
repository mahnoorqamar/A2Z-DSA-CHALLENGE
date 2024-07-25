package Numbers;

import java.util.Scanner;

public class CountDigits {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while(num > 0){
            int lastDigit;
            lastDigit = num % 10;
            System.out.println(lastDigit);
            count = count+1;
            num = num / 10;
        }

        System.out.println(count);
    }
}

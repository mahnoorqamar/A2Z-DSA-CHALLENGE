package Numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class CountDigits {
    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int count = 0;
//        while(num > 0){
//            int lastDigit;
//            lastDigit = num % 10;
//            System.out.println(lastDigit);
//            count = count+1;
//            num = num / 10;
//        }
//
//        System.out.println(count);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        ArrayList<Integer> digits = new ArrayList<>();

        while(num > 0){
            digits.add(num % 10);
            num = num / 10;
            count++;
        }

        for(int i = digits.size() -1; i >= 0; i--){
            System.out.println(digits.get(i));
        }

        System.out.println(count);


    }


}

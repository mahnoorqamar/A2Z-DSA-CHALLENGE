package Numbers;

import java.util.Scanner;
import java.util.ArrayList;

public class ExtratDigits {
    public static void main(String[] args) {
        // Extract the digits
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> digits = new ArrayList<>();

        while(num > 0){
            digits.add(num % 10);
            num = num / 10;
        }

        for(int i = digits.size() -1; i >= 0; i--){
            System.out.println(digits.get(i));
        }

//        extractDigits(num);
    }

    public static void extractDigits(int num){
        if(num < 10){
            System.out.println(num % 10);
            return;
        }

        extractDigits(num / 10);
        extractDigits(num % 10);
    }

}


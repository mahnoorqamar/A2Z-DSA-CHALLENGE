package String;

import java.math.BigInteger;

public class MultiplyString {
    public static String multiply(String num1, String num2){
        // Use BigInteger to handle very large numbers
        BigInteger bigNum1 = new BigInteger(num1);
        BigInteger bigNum2 = new BigInteger(num2);

        // Multiply the two BigIntegers
        BigInteger product = bigNum1.multiply(bigNum2);

        // Convert the product back to a string and return it
        return product.toString();
    }
}

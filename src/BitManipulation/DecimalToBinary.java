package BitManipulation;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(526));
    }
    public static String decimalToBinary(int decimal){
        if(decimal == 0){
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while(decimal > 0){
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal = decimal / 2;
        }

        return binary.toString();
    }
}

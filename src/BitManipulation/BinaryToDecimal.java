package BitManipulation;

public class BinaryToDecimal {
    public static int binaryToDecimal(String binaryString){
        return Integer.parseInt(binaryString, 2);
    }

    public static void main(String[] args) {
        String binary = "101110";
        System.out.println(binaryToDecimal(binary));
    }
}

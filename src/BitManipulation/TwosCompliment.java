package BitManipulation;

public class TwosCompliment {
    // 2s Complement of a number.
    // Step 1 - (13) -> (1101) base 2 = (0010) flip means 0 to 1 and 1 to 0
    // Step 2 - Add one to it = (0011)

    public static String findCompliment (String binaryString){
        int number = Integer.parseInt(binaryString, 2);

        int twoComplement = ~number + 1;

        String binaryTwosComplement = Integer.toBinaryString(twoComplement);

        return binaryTwosComplement;
    }
}

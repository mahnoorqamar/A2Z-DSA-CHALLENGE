package BitManipulation;

public class OnesCompliment {
    // 1s Complement of a number.
    // (13) -> (1101) base 2 = (0010) flip means 0 to 1 and 1 to 0

    public static String findCompliment (String binaryString){
        StringBuilder complement = new StringBuilder();

        for(char bit: binaryString.toCharArray()){
            if(bit == '0'){
                complement.append('1');
            } else if (bit == '1') {
                complement.append('0');
            } else {
                throw new IllegalArgumentException("Invalid binary number");
            }
        }

        return complement.toString();
    }
}

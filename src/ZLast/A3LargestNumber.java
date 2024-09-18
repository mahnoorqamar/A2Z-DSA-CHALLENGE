package ZLast;
import java.util.Arrays;

public class A3LargestNumber {
    public static void main(String[] args) {

    }

    public String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            strNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));
        if(strNums[0].charAt(0) == '0'){
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String str : strNums) {
            result.append(str);
        }

        return result.toString();
    }
}

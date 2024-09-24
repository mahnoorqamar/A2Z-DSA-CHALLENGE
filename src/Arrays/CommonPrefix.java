package Arrays;

public class CommonPrefix {


    public int commonPrefixLength(String num1, String num2){
        int minLength = Math.min(num1.length(), num2.length());
        int commonLength = 0;

        for(int i = 0; i < minLength; i++){
            if(num1.charAt(i) == num2.charAt(i)){
                commonLength++;
            } else {
                break;
            }
        }

        return commonLength;
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int maxLength = 0;

        for(int num1 : arr1){
            for(int num2 : arr2){
                String str1 = Integer.toString(num1);
                String str2 = Integer.toString(num2);

                int currentLength = commonPrefixLength(str1, str2);
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

}

package String;

public class ContainsSubString {
    public static boolean contains(String original, String substring){
        int originalLength = original.length();
        int substringLength = substring.length();

        if(substringLength > originalLength){
            return false;
        }

        for(int i = 0; i <= originalLength - substringLength; i++){
            boolean contain = true;
            for (int j = 0; j < substringLength; j++) {
                if (original.charAt(i + j) != substring.charAt(j)) {
                    contain = false; // A mismatch found
                    break; // No need to check further for this starting position
                }
            }
            // If a match is found, return true
            if (contain) {
                return true;
            }
        }

        return false;
    }
}

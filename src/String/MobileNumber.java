package String;

public class MobileNumber {
    public static void main(String[] args) {

    }

    static String printSequence(String arr[], String input) {
        String output = "";

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == ' '){
                output = output + "0";
            } else {
                int position = input.charAt(i) - 'A';
                output = output + arr[position];
            }

        }

        return output;
    }
}

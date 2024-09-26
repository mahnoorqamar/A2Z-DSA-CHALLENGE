package String;

public class LengthOfString {
    public static void main(String[] args) {
        String s = "Mahnoor";
        System.out.println(stringLength(s));
        System.out.println(stringToUpper(s));
    }

    public static int stringLength(String s){
        int count = 0;
        for(char ch : s.toCharArray()){
            count++;
        }

        return count;
    }

    public static String stringToUpper(String s){
        String result = s.toUpperCase();
        return result;
    }
}

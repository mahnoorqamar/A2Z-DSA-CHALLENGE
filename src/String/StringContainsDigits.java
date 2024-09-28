package String;

public class StringContainsDigits {
    public static void main(String[] args) {
        String s ="4598";
        System.out.println(containsDigit(s));
    }
    public static boolean containsDigit(String str){
        for(int i = 0; i < str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }

        return true;
    }
}

package String;

public class Replace20 {
    public static void main(String[] args) {
        String s = "This is a string";
        System.out.println(replace20(s));
    }
    public static String replace20 (String str){
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                result.append("%20");
            } else {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}

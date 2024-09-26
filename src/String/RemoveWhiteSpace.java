package String;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String s = "Mahnoor is Mahnoor";
        System.out.println(removeWhitespace(s));
    }
    public static String removeWhitespace(String s){

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch != ' ' && ch != '\n' && ch != '\t'){
                result.append(ch);
            }
        }

        return result.toString();
    }
}

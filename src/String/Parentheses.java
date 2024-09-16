package String;

public class Parentheses {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (balance > 0) {
                    result.append(ch);
                }
                balance++;
            } else {
                balance--;
                if(balance > 0){
                    result.append(ch);
                }

            }

        }

        return result.toString();
    }
}

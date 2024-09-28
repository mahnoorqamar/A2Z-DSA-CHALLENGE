package String;

public class ReverseWords2 {
    public static void main(String[] args) {
        String s = "Hello This is Mahnoor";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String str) {
        // Split the string into words
        String[] words = str.split(" ");

        // Reverse the array of words
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }

        // Join the words back into a single string
        return String.join(" ", words);
    }
}

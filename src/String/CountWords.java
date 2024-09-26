package String;

public class CountWords {
    public static void main(String[] args) {
        String s = "This is a String";
        System.out.println(countWords(s)); // Should print 4
    }

    public static int countWords(String s) {
        int count = 0;
        boolean inWord = false; // Track if we are inside a word

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Check if the character is not a whitespace
            if (ch != ' ' && ch != '\n' && ch != '\t') {
                if (!inWord) {
                    count++; // We found a new word
                    inWord = true; // Set the flag to true
                }
            } else {
                inWord = false; // We are not in a word anymore
            }
        }

        return count; // Return the total word count
    }
}

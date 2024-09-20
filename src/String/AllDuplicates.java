package String;

import java.util.Arrays;

public class AllDuplicates {
    public static void main(String[] args) {

    }

    public static void printDuplicateCharacters(String str) {
        // Convert the string to a character array and sort it
        char[] chars = str.toCharArray();
        Arrays.sort(chars);  // Sorting helps bring duplicates together

        // Initialize two pointers: left and right
        int left = 0;
        int n = chars.length;

        System.out.println("Duplicate characters in the string are:");

        // Traverse the sorted array with the two pointers
        while (left < n - 1) {
            int right = left + 1;

            // Check if the current character at left is the same as the one at right
            if (chars[left] == chars[right]) {
                System.out.print(chars[left] + " ");

                // Move right until we get a different character (skip duplicates)
                while (right < n && chars[right] == chars[left]) {
                    right++;
                }
            }
            // Move the left pointer to the next unique character
            left = right;
        }
    }
}

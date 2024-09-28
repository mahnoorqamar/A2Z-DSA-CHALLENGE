package String;

public class Slice {
    public static String extractSubstring(String s, int start, int end) {
        // Validate the indices
        if (start < 0 || end > s.length() || start > end) {
            throw new IllegalArgumentException("Invalid start or end index");
        }

        // Extract the substring using substring method
        return s.substring(start, end);
    }
}

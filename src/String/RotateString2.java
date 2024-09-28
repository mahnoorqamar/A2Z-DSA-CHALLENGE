package String;

public class RotateString2 {
    public static boolean isRotated(String str1, String str2)
    {
        if(str1.length() != str2.length()){
            return false;
        }

        String leftRotated = str1.substring(2) + str1.substring(0, 2);
        String rightRotated = str1.substring(str1.length() - 2) + str1.substring(0, str1.length() - 2);

        return str2.equals(leftRotated) || str2.equals(rightRotated);
    }
}

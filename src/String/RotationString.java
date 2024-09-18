package String;

public class RotationString {
    public static void main(String[] args) {

    }

    public static boolean isRotated(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        String concatanated = s1 + s2;

        return concatanated.contains(s1);
    }
}

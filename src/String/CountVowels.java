package String;

public class CountVowels {
    public static void main(String[] args) {
        String s = "Mahnoor";
        System.out.println(countVowels(s));
    }

    public static int countVowels(String s){
        int count = 0;
        s = s.toLowerCase();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u'){
                count++;
            }
        }

        return count;
    }
}

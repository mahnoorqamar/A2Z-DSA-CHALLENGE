package Pattern;

public class Pattern2 {
    public static void main (String[] args){
        int n = 7;
        for (int i = 0; i < n ; i++){
            for (int j = 0; j < i ; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

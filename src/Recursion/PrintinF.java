package Recursion;

public class PrintinF {
    public static void main(String[] args) {
         printing();
    }
    static int count = 0;
    static void printing(){
        if(count > 4){
            return;
        }
        System.out.println("Hello this is recursive function");
        count++;
        printing();
    }
}

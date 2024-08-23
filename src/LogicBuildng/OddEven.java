package LogicBuildng;

public class OddEven {
    public static void main(String[] args) {
        System.out.println(Even(13));
    }

    public static boolean Even(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
}

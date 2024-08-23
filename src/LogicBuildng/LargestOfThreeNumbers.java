package LogicBuildng;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        System.out.println(largest(1, 2, 6));
    }

    public static int largest(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3){
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else if (num3 > num1 && num3 > num2) {
            return num3;
        }

        return -1;
    }
}

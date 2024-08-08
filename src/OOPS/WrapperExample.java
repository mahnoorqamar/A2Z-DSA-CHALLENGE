package OOPS;

public class WrapperExample {
    public static void main(String[] args) {
        Integer num = 45;

        num.hashCode();
        System.out.println(num);

        Integer a = 10;
        Integer b = 20;

        swap(a, b);


    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}

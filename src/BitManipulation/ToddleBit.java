package BitManipulation;

public class ToddleBit {

    public static int toddle(int num, int position){
        int mask = 1 << position;
        return mask ^ num;
    }
}

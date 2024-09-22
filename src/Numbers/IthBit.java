package Numbers;

public class IthBit {
    public static void main(String[] args) {

    }

    static int ithBit(int num, int i){
        return (num >> i) & 1;

    }
}

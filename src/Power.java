import java.util.*;
import java.io.*;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 3;
        int n = 4;

        int ans = 1;
        for (int i = 0; i < n; i++) {
            ans *= x;
        }

        System.out.println(ans);
    }
}

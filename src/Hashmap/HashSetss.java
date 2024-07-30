package Hashmap;
import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetss {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(85);
        set.add(58);
        set.add(28);
        set.add(68);
        set.add(88);
        set.add(48);
        set.add(98);

//        if(!set.contains(2)){
//            System.out.println("hey");
//        }
//
//        set.remove(85);

//        for (int i : set){
//            System.out.print(i + " ");
//        }

        Iterator it = set.iterator();
        // hasnext
        while (it.hasNext()){
            System.out.println(it.next());
        }
        // next
//        it.next();
    }
}

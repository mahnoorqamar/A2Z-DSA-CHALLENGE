package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums){
        Set<Integer> counter = new HashSet<>();

        for(int i : nums){
            if (!counter.add(i)){
                return true;
            }
        }

        return false;
    }
}

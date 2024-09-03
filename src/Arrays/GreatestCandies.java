package Arrays;

import java.util.ArrayList;
import java.util.List;

public class GreatestCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Step 1: Find the maximum candies any kid has
        int maxCandies = Integer.MIN_VALUE; // Start with the smallest possible value
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy); // Update maxCandies if we find a larger value
        }

        // Step 2: Determine if each kid can have the greatest number of candies
        List<Boolean> result = new ArrayList<>(); // To store the final result
        for (int candyCount : candies) {
            // If the current kid's candies plus extraCandies is >= maxCandies, add true; otherwise, add false
            if (candyCount + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        // Step 3: Return the final list of results
        return result;
    }

}

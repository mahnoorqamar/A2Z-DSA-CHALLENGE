package Arrays;

public class MaximumConsecutive {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 1, 0, 0, 1, 1};
    }

    public static int findConsecuritive(int[] arr){
        int currentCount = 0;
        int maxCOunt = 0;

        for (int num : arr){
            if(currentCount == 1){
                currentCount++;
                if (currentCount > maxCOunt){
                    maxCOunt = currentCount;
                } else {
                    currentCount = 0;
                }
            }
        }

        return maxCOunt;
    }
}

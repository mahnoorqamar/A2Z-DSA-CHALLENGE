package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {


    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isLeader = true;

            // Check if arr[i] is greater than all elements to its right
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    isLeader = false;
                    break;
                }
            }

            // If arr[i] is a leader, add it to the list
            if (isLeader) {
                leaders.add(arr[i]);
            }
        }

        return leaders;
    }

    // optimal
    public static List<Integer> optfindLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        // Traverse the array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                leaders.add(max);
            }
        }

        // Reverse the list to maintain the original order of leaders
        Collections.reverse(leaders);
        return leaders;
    }


    public static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(int i = arr.length -1; i >=0; i--){
            if(arr[i] >= max){
                max = arr[i];
                leaders.add(max);
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }
}

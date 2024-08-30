package Arrays;

public class MajorityElement {
    public static void main(String[] args) {

    }

    public static int majorityy(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return arr[i];
            }
        }

        // If no majority element is found
        return -1; // You can return any value here or throw an exception if preferred
    }


    // optimal
    public static int majority(int[] arr) {
        int candidate = findCandidate(arr);

        // Phase 2: Verify the candidate
        if (isMajority(arr, candidate)) {
            return candidate;
        } else {
            return -1; // No majority element found
        }
    }

    private static int findCandidate(int[] arr) {
        int count = 0;
        int candidate = -1;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    private static boolean isMajority(int[] arr, int candidate) {
        int count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        return count > arr.length / 2;
    }



}

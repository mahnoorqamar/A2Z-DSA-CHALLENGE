package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};

        HashSet<Integer> unionSet = findUnion(arr1, arr2);

        // Print the union set
        for (int num : unionSet) {
            System.out.print(num + " ");
        }
    }

    public static HashSet<Integer> findUnion (int [] arr1, int[] arr2){
        HashSet<Integer> union = new HashSet<>();

        for (int n : arr1){
            union.add(n);
        }
        for (int n: arr2){
            union.add(n);
        }

        return union;


    }

    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0; // pointers
        ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else // case 3
            {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size()-1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
}

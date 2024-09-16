package ZLast;

public class AMergeTwoArrays {
    public static void main(String[] args) {

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int i = m -1;
        int j = n -1;
        int k = m + 1 -1;

        while(i >= 0 && j >=0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums2[i];
                i--;
            } else {
                nums1[k]= nums2[k];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

    }
}

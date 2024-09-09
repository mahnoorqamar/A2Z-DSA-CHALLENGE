package SearchingAlgo.BinarySearch;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f'};
        char target = 'c';
    }

//    public static char nextGreatestLetter(char[] letters, char target){
//        if(target > letters[letters.length -1]){
//            return -1;
//        }
//        int start = 0;
//        int end = target.length-1;
//        while(start <= end){
//            int mid = start + (end - start) /2;
//            if(target < letters[mid]){
//                end = mid -1;
//            } else {
//                start = mid +1;
//            }
//        }
//
//        return end;
//    }
}

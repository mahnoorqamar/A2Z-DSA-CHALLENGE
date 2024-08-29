package Arrays;

public class SecondLargest {
    public static void main(String[] args) {

    }

    public static int secondLargest(int[] arr){
        int largest = arr[0];
        int second = arr[0];

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > largest){
                second = arr[i];
                largest = arr[i];
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != largest) {  // Ignore the largest element
                if (second == -1 || arr[i] > arr[second]) {
                    second = i;  // Update second largest's index
                }
            }
        }

        if (second == -1) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + arr[second]);
        }


        return second;
    }

}



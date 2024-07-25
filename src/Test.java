public class Test {

    public static int[] findMinMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 6, 3, 10};
        int[] result = findMinMax(array);
    }
}
import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        // Sample sorted arrays
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        // Merge the arrays
        int[] mergedArray = mergeArrays(array1, array2);

        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    // Method to merge two sorted arrays
    public static int[] mergeArrays(int[] array1, int[] array2) {
        // Create a new array to store the merged result
        int[] mergedArray = new int[array1.length + array2.length];

        int i = 0, j = 0, k = 0;

        // Merge the arrays by comparing elements from both arrays
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        // If there are remaining elements in array1, add them
        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }

        // If there are remaining elements in array2, add them
        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }
}

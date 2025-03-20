import java.util.Scanner;//scanner class is used to read input
import java.util.Arrays;

public class ArrayMerger {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take input for the first sorted array
        System.out.print("Enter the number of elements for the first array: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Enter the elements of the first array in sorted order:");
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Take input for the second sorted array
        System.out.print("Enter the number of elements for the second array: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter the elements of the second array in sorted order:");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Merge the two arrays
        int[] mergedArray = mergeArrays(array1, array2);

        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));

        // Close the scanner
        scanner.close();
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

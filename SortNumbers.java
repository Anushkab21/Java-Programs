import java.util.Scanner;
import java.util.Arrays;
public class SortNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter 10 numbers in a single line, separated by spaces
        System.out.println("Enter 10 numbers separated by spaces:");
        
        // Read the entire line of input
        String input = scanner.nextLine();
        
        // Split the input string into an array of strings using spaces as the delimiter
        String[] inputArray = input.split(" ");
        
        // Convert the array of strings to an array of integers
        int[] numbers = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }
        
        // Sort the array using Arrays.sort() method
        Arrays.sort(numbers);
        
        // Display the sorted array
        System.out.println("Numbers sorted in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        // Close the scanner
        scanner.close();
    }
}

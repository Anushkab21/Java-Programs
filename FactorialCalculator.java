import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Call the method to calculate factorial and display the result
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to calculate factorial of a number
    public static long calculateFactorial(int n) {
        long result = 1;
        
        // Factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return result;
        }
        
        // Loop to calculate factorial for numbers greater than 1
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }
}

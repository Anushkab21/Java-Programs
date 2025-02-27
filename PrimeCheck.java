public class PrimeCheck {
    public static void main(String[] args) {
        // Check if the user has provided a number via command line arguments
        if (args.length != 1) {
            System.out.println("Please provide exactly one number as a command line argument.");
            return; // Exit the program if no or more than one argument is provided
        }
        
        // Parse the command line argument as an integer
        int number = Integer.parseInt(args[0]);
        
        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Handle edge cases for numbers less than 2
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check for factors of num from 2 to sqrt(num)
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // If divisible by any number other than 1 and itself, it's not prime
            }
        }

        return true; // If no factors were found, the number is prime
    }
}

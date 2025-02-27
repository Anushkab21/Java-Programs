import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare two 2x2 matrices
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];

        // Prompt user to input values for matrix1
        System.out.println("Enter values for the first 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matrix1- ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Prompt user to input values for matrix2
        System.out.println("\nEnter values for the second 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matrix2[" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Display menu for operations
        System.out.println("\nChoose an operation:");
        System.out.println("1. Matrix Addition");
        System.out.println("2. Matrix Multiplication");
        System.out.println("3. Transpose of Matrix1");
        System.out.println("4. Transpose of Matrix2");
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        //operation using a switch-case statement
        switch (choice) {
            case 1:
                // Matrix Addition
                int[][] sum = new int[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        sum[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }
                System.out.println("\nMatrix Addition Result:");
                printMatrix(sum);
                break;

            case 2:
                // Matrix Multiplication
                int[][] product = new int[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        product[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j];
                    }
                }
                System.out.println("\nMatrix Multiplication Result:");
                printMatrix(product);
                break;

            case 3:
                // Transpose of Matrix1
                int[][] transpose1 = new int[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        transpose1[i][j] = matrix1[j][i];
                    }
                }
                System.out.println("\nTranspose of Matrix1:");
                printMatrix(transpose1);
                break;

            case 4:
                // Transpose of Matrix2
                int[][] transpose2 = new int[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        transpose2[i][j] = matrix2[j][i];
                    }
                }
                System.out.println("\nTranspose of Matrix2:");
                printMatrix(transpose2);
                break;

            default:
                System.out.println("Invalid choice! Please select a valid option.");
                break;
        }

        // Close the scanner
        scanner.close();
    }

    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

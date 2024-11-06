/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2023
 */
import java.util.Scanner;

public class DiagonalSums {
    
    // Function to calculate the left diagonal sum
    public static int leftDiagonalSum(int[][] matrix, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i]; // Sum elements where row index equals column index
        }
        return sum;
    }

    // Function to calculate the right diagonal sum
    public static int rightDiagonalSum(int[][] matrix, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += matrix[i][size - 1 - i]; // Sum elements where row index + column index = size - 1
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the square matrix
        System.out.print("Enter the size of the square matrix (n x n): ");
        int size = scanner.nextInt();

        // Initialize the square matrix
        int[][] matrix = new int[size][size];

        // Input the matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate the diagonal sums
        int leftSum = leftDiagonalSum(matrix, size);
        int rightSum = rightDiagonalSum(matrix, size);

        // Print the results
        System.out.println("Left diagonal sum: " + leftSum);
        System.out.println("Right diagonal sum: " + rightSum);

        // Close the scanner
        scanner.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2023
 */
import java.util.Scanner;

public class OrderCheck {
    
    // Method to check the order of the numbers
    public static String checkOrder(double num1, double num2, double num3) {
        if (num1 < num2 && num2 < num3) {
            return "increasing";
        } else if (num1 > num2 && num2 > num3) {
            return "decreasing";
        } else {
            return "Neither increasing nor decreasing order";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept three numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Call the method to check the order and print the result
        String result = checkOrder(num1, num2, num3);
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}


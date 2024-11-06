/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2023
 */
import java.util.Scanner;

public class FloatingPointComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two floating-point numbers from the user
        System.out.print("Enter the first floating-point number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second floating-point number: ");
        float num2 = scanner.nextFloat();

        // Check if they are equal up to three decimal places
        boolean areEqual = Math.round(num1 * 1000) == Math.round(num2 * 1000);

        if (areEqual) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are not the same up to three decimal places.");
        }

        // Close the scanner
        scanner.close();
    }
}


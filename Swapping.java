/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2023
 */
public class Swapping {
    private int a;
    private int b;

    public Swapping(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void swap() {
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        a = a + b; // Step 1: a now contains the sum of a and b
        b = a - b; // Step 2: b is now the original value of a
        a = a - b; // Step 3: a is now the original value of b
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        Swapping example = new Swapping(5, 10);
        example.swap();
    }
}


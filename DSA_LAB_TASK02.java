/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa_lab_task02;

/**
 *
 * @author 123
 */
public class DSA_LAB_TASK02 {

    public static void main(String[] args) {
        int[][] array = {{2,3},{4,5}}; 
        int sum=0;
        for(int i=0;i<=1;i++){
            for(int j=0;j<=1;j++){
                sum+=array[i][j];
                System.out.println(sum);
            }
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dsa_lab_task03;

/**
 *
 * @author 123
 */
public class DSA_LAB_TASK03 {

    public static void main(String[] args) {
      
        int[] array={3,4,5,6};
        int start=0;
        int end=array.length-1;
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
            
        }
        System.out.print("Reversed Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

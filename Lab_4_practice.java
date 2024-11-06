/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2023
 */
class Node{
int data;
Node address;

public Node(int data){
this.data=data;
this.address=null;
}
}
public class Lab_4_practice {
public static void main(String []args){
Node node1=new Node(1);
Node node2=new Node(2);
Node node3=new Node(3);
Node node4=new Node(4);
node1.address=node2;
node2.address=node3;
node3.address=node4;
node4.address=null;
System.out.println(node1.data);
System.out.println(node1.address.data);
System.out.println(node1.address.address.data);
System.out.println(node1.address.address.address.data);
} 
}

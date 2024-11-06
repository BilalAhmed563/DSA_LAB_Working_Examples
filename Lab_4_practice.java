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

Node head,tail;
int size;
public Lab_4_practice(){
    head=tail=null;
    size=0;
}
public void add(int d){
    Node n=new Node(d);
    if(head==null){
        head=tail=n;
    }
    else{
        tail.address=n;
        tail=n;
    }
    size++;
}
public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.address;
        }
        System.out.println("null"); 
        System.out.println("Size of the linked list: " + size);// Indicates the end of the list
    }
public static void main(String []args){
    Lab_4_practice list=new Lab_4_practice();
    list.add(1); 
    list.add(2);
    list.add(3);
    list.add(4);
     list.add(5);
     list.add(6);
    
    list.printList();
    
}
} 


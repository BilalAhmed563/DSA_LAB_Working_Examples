/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dsu-11
 */
class Node{
    int key;
    Node left,right;
    public Node(int item){
    key=item;
    left=right=null;
    
    
    }
    
}
public class BinaryTree {
    Node root;
    BinaryTree(int key){
        root=new Node(key);
    }
    BinaryTree(){
        root=null;
    }
    public void printPreorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.key + " "); 
        printPreorder(node.left);  
        printPreorder(node.right);  
    }
    
    public void printPostorder(Node node) {
        if (node == null) {
            return;
        }
        printPostorder(node.left); 
        printPostorder(node.right);  
        System.out.print(node.key + " "); 
    }
     public void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left); 
        System.out.print(node.key + " ");  
        printInorder(node.right);  
    }
    
    public static void main(String[] args){
        BinaryTree tree=new BinaryTree();
        tree.root=new Node(1);
        Node a =new Node(2);
        tree.root.left=a;
        Node b=new Node(3);
        tree.root.right=b;
        a.left=new Node(4);
        a.right=new Node(5);
        
        System.out.println("preorder:");
        tree.printPreorder(tree.root);
        System.out.println("\npostorder:");
        tree.printPostorder(tree.root);
        System.out.println("\ninorder:");
        tree.printInorder(tree.root);
        
        
    }
     
}

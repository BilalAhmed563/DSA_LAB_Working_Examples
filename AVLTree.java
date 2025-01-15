/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dsu-11
 */
// Java program for insertion in AVL Tree
class Node {
    int key, height;
    Node left, right;

    Node(int d) {
        key = d;
        height = 1;
    }
}
public class AVLTree {
    Node root;
    int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }
    int max(int a, int b) {
        return (a > b) ? a : b;
    }
    Node rightRotate(Node y) {

        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;
        return x;
    }
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
        return y;
    }
    int getBalance(Node N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }
    Node insert(Node node, int key) {
        if (node == null)
            return (new Node(key));
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else 
            return node;
        node.height = 1 + max(height(node.left), height(node.right));
        int balance = getBalance(node);
        
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);
        
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    
    void printInOrder(Node node) {
        if (node == null)
            return;
        printInOrder(node.left);
        System.out.print(node.key + " ");
        printInOrder(node.right);
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        System.out.println("Inserting nodes in AVL Tree:");
        
        tree.root = tree.insert(tree.root, 10); // Simple insertion
        tree.root = tree.insert(tree.root, 20); // Causes Right-Right case
        tree.root = tree.insert(tree.root, 30); // Causes Right-Right case (rotation)
        
        System.out.println("\nInorder traversal after inserting 10, 20, and 30:");
        tree.printInOrder(tree.root);  // Expected to be balanced after rotation
        
        tree.root = tree.insert(tree.root, 15); // Causes Left-Right case
        
        System.out.println("\nInorder traversal after inserting 15:");
        tree.printInOrder(tree.root);  // Should trigger Left-Right rotation
        
        tree.root = tree.insert(tree.root, 25); // Simple insertion
        tree.root = tree.insert(tree.root, 5);  // Causes Left-Left case
        
        System.out.println("\nInorder traversal after inserting 25 and 5:");
        tree.printInOrder(tree.root);  // Expected to be balanced after rotation

        tree.root = tree.insert(tree.root, 50); // Causes Right-Left case

        System.out.println("\nInorder traversal after inserting 50:");
        tree.printInOrder(tree.root);  // Should trigger Right-Left rotation
    }
}

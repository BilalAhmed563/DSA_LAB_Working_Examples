/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dsu-11
 */
import java.util.LinkedList;
import java.util.Queue;
public class Lab_8_ass {
    Node root;
    class Node {
    int data;
    Node left, right;
    Node(int data) {
    this.data = data;
    left = right = null;
    }
    }
    public int calculateLevel(Node node) {
    if (node == null) return 0;
    return Math.max(calculateLevel(node.left), calculateLevel(node.right)) + 1;
    }
    public String checkTreeType(Node node) {
    if (node == null) 
    return "Both";
    Queue<Node> queue = new LinkedList<>();
    queue.add(node);
    boolean isFull = true;
    boolean isComplete = true;
    boolean flag = false;
    while (!queue.isEmpty()) {
    Node currentNode = queue.poll();
    if (currentNode.left != null) {
    if (flag) isComplete = false;
    queue.add(currentNode.left);
    } else {
    flag = true;
    }
   if (currentNode.right != null) {
    if (flag)
        isComplete = false;
queue.add(currentNode.right);
    } else {
   flag = true;
 }
if ((currentNode.left == null && currentNode.right != null) || 
(currentNode.left != null && currentNode.right == null)) {
 isFull = false;
 }
 }
    if (isFull && isComplete) {
 return "Both";
 } else if (isFull) {
return "Full Tree";
 } else if (isComplete) {
 return "Complete Tree";
} else {
return "Neither Full nor Complete Tree";
}
    }
public boolean isChildrenSumProperty(Node node) {
if (node == null || (node.left == null && node.right == null))
    return true;
    int leftData = node.left != null ? node.left.data : 0;
   int rightData = node.right != null ? node.right.data : 0;
 return (node.data == leftData + rightData) &&
  isChildrenSumProperty(node.left) && isChildrenSumProperty(node.right);
    }


    public static void main(String[] args) {
   Lab_8_ass tree = new Lab_8_ass();
    tree.root = tree.new Node(10);
 tree.root.left = tree.new Node(8);
   tree.root.right = tree.new Node(2);
   tree.root.left.left = tree.new Node(3);
   tree.root.left.right = tree.new Node(5);
  tree.root.right.left = tree.new Node(2);
  System.out.println("Tree Level (Height): " + tree.calculateLevel(tree.root));
  System.out.println("Tree Type: " + tree.checkTreeType(tree.root));
  if (tree.isChildrenSumProperty(tree.root)) {
System.out.println("Tree satisfies the Children Sum Property");
   } else {
  System.out.println("Tree does not satisfy the Children Sum Property");
     }
    }
}

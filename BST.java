class Node {
    int key;
    Node left, right;
    
    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BST {
    Node root;
    BST(int key) {
        root = new Node(key);
    }
    BST() {
        root = null;
    }
    void printpostorder(Node node) {
        if (node == null)
            return;
        printpostorder(node.left);
        printpostorder(node.right);
        System.out.println(node.key + " ");
    }
    void printpreorder(Node node) {
        if (node == null)
            return;
        System.out.println(node.key + " ");
        printpreorder(node.left);
        printpreorder(node.right);
    }
    void printinorder(Node node) {
        if (node == null)
            return;
        printinorder(node.left);
        System.out.println(node.key + " ");
        printinorder(node.right);
    }
    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = new Node(8);
        Node a = new Node(3);
        tree.root.left = a;
        Node b = new Node(10);
        tree.root.right = b;
        a.left = new Node(1);
        a.right = new Node(6);
        b.left = new Node(9);
        b.right = new Node(14);
        System.out.println("Pre-order traversal:");
        tree.printpreorder(tree.root);
        System.out.println("\nPost-order traversal:");
        tree.printpostorder(tree.root);       
        System.out.println("\nIn-order traversal:");
        tree.printinorder(tree.root);
        // Inserting nodes
        System.out.println("\nInserting nodes 4, 7, 13 into the tree...");
        tree.root = tree.insertrec(tree.root, 4);
        tree.root = tree.insertrec(tree.root, 7);
        tree.root = tree.insertrec(tree.root, 13);
        
        System.out.println("\nPre-order traversal after insertion:");
        tree.printpreorder(tree.root);
         System.out.println("\nPost-order traversal after insertion:");
        tree.printpostorder(tree.root);
         System.out.println("\nin-order traversal after insertion:");
        tree.printinorder(tree.root);
        int keyToSearch = 7;
        Node foundNode = tree.search(tree.root, keyToSearch);
        if (foundNode != null) {
            System.out.println("\nNode with key " + keyToSearch + " found!");
        } else {
            System.out.println("\nNode with key " + keyToSearch + " not found.");
        }
        System.out.println("\nDeleting node with key 10...");
        tree.root = tree.deleterec(tree.root, 10);        
        System.out.println("\nPre-order traversal after insertion:");
        tree.printpreorder(tree.root);
         System.out.println("\nPost-order traversal after insertion:");
        tree.printpostorder(tree.root);
         System.out.println("\nin-order traversal after insertion:");
        tree.printinorder(tree.root);
    }
     public Node search(Node root, int key) {
        if (root == null || root.key == key)
            return root;
        if (root.key > key)
            return search(root.left, key);
        return search(root.right, key);
    }
    Node insertrec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        } else {
            if (key < root.key)
                root.left = insertrec(root.left, key);
            else if (key > root.key)
                root.right = insertrec(root.right, key);
        }
        return root;
    }
    public Node deleterec(Node root, int key) {
        if (root == null)
            return root;
        if (key < root.key)
            root.left = deleterec(root.left, key);
        else if (key > root.key)
            root.right = deleterec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.key = minValue(root.right);
            root.right = deleterec(root.right, root.key);
        }
        return root;
    }
    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
}

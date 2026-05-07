import java.util.Scanner;

class BST {

    class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    Node root = null;

    // Insert
    Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Search
    void search(Node root, int key) {
        if (root == null) {
            System.out.println("Element not found");
            return;
        }

        if (root.data == key) {
            System.out.println("Element found");
        } 
        else if (key < root.data) {
            search(root.left, key);
        } 
        else {
            search(root.right, key);
        }
    }

    // Inorder Traversal
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BST tree = new BST();
        int n, val, key;

        System.out.print("Enter number of nodes: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            val = sc.nextInt();
            tree.root = tree.insert(tree.root, val);
        }

        System.out.println("\nInorder Traversal:");
        tree.inorder(tree.root);

        System.out.print("\nEnter element to search: ");
        key = sc.nextInt();
        tree.search(tree.root, key);
    }
}

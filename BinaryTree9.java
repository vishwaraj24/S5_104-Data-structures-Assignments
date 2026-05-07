import java.util.Scanner;

class BinaryTree {
    class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }
    Node root = null;
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
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        int n, val;

        System.out.print("Enter number of nodes: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            val = sc.nextInt();
            tree.root = tree.insert(tree.root, val);
        }

        System.out.println("\nInorder:");
        tree.inorder(tree.root);

        System.out.println("\nPreorder:");
        tree.preorder(tree.root);

        System.out.println("\nPostorder:");
        tree.postorder(tree.root);
    }
}
import java.util.Scanner;

class SLL {

    class Node {
        int data;
        Node next;
    }

    Node head = null;

    void insert(int value) {
        Node n = new Node();
        n.data = value;
        n.next = null;

        if (head == null) {
            head = n;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    void delete() {
        if (head == null) {
            System.out.println("List Empty");
        } else {
            head = head.next;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        SLL obj = new SLL();
        int choice, value;

        do {
            System.out.println("\n1.Insert 2.Delete 3.Display 4.Exit");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter value: ");
                value = sc.nextInt();
                obj.insert(value);
            }
            else if (choice == 2) {
                obj.delete();
            }
            else if (choice == 3) {
                obj.display();
            }

        } while (choice != 4);
    }
}
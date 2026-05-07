import java.util.Scanner;

class StackLL {

    class Node {
        int data;
        Node next;
    }

    Node top = null;

    void push(int value) {
        Node n = new Node();
        n.data = value;
        n.next = top;
        top = n;
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack Empty");
        } else {
            System.out.println("Deleted: " + top.data);
            top = top.next;
        }
    }

    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StackLL s = new StackLL();
        int ch, val;

        do {
            System.out.println("\n1.Push 2.Pop 3.Display 4.Exit");
            ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter value: ");
                val = sc.nextInt();
                s.push(val);
            } else if (ch == 2) {
                s.pop();
            } else if (ch == 3) {
                s.display();
            }

        } while (ch != 4);
    }
}
import java.util.Scanner;

class QueueLL {

    class Node {
        int data;
        Node next;
    }

    Node front = null, rear = null;

    void enqueue(int value) {
        Node n = new Node();
        n.data = value;
        n.next = null;

        if (rear == null) {
            front = rear = n;
        } else {
            rear.next = n;
            rear = n;
        }
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue Empty");
        } else {
            System.out.println("Deleted: " + front.data);
            front = front.next;

            if (front == null) {
                rear = null;
            }
        }
    }

    void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        QueueLL q = new QueueLL();
        int ch, val;

        do {
            System.out.println("\n1.Enqueue 2.Dequeue 3.Display 4.Exit");
            ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter value: ");
                val = sc.nextInt();
                q.enqueue(val);
            } else if (ch == 2) {
                q.dequeue();
            } else if (ch == 3) {
                q.display();
            }

        } while (ch != 4);
    }
}
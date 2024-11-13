// package LinkedList.DLL;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
};

public class Insertion {
    // Print the doubly linked list
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Insert a node at the beginning
    static Node insertBegin(Node head, int data) {

        // Create a new node
        Node new_node = new Node(data);
        new_node.next = head;
        // Set previous of head as new node
        if (head != null) {
            head.prev = new_node;
        }
        return new_node;
    }

    public static void main(String[] args) {

        // Create a hardcoded doubly linked list:
        // 20 <-> 30 <-> 40
        Node head = new Node(20);
        head.next = new Node(30);
        head.next.prev = head;
        head.next.next = new Node(40);
        head.next.next.prev = head.next;

        // Print the original list
        System.out.print("Original Linked List: ");
        printList(head);

        // Insert a new node at the front of the list
        head = insertBegin(head, 10);

        // Print the updated list
        System.out.print("After inserting Node 1 at the front: ");
        printList(head);
    }
}

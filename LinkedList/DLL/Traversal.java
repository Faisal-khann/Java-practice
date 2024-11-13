package LinkedList.DLL;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}

public class Traversal {
    // Function to traverse the doubly linked list
    // in forward direction
    static void forwardTraversal(Node head) {
        // Start traversal from the head of the list
        Node curr = head;

        // Continue until the current node is
        // null (end of the list)
        while (curr != null) {

            // Output data of the current node
            System.out.print(curr.data + " ");

            // Move to the next node
            curr = curr.next;
        }
        // Print newline after traversal
        System.out.println();
    }

    // In backward direction
    static void backwardTraversal(Node tail) {

        // Start traversal from the head of the list
        Node curr = tail;

        // Continue until the current node is
        // null (end of the list)
        while (curr != null) {

            // Output data of the current node
            System.out.print(curr.data + " ");

            // Move to the next node
            curr = curr.prev;
        }

        // Print newline after traversal
        System.out.println();
    }

    public static void main(String[] args) {
        // Sample usage of the doubly linked
        // list and traversal functions
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;

        System.out.println("Forward Traversal:");
        forwardTraversal(head);

        System.out.println("Backward Traversal:");
        backwardTraversal(fourth);
    }

}


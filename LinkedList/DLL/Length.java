// package LinkedList.DLL;

class Node{
    int data; 
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.next = null;
    }
};

public class Length {

    static int FindLength(Node head) {
        int count = 0;
        Node cur = head;

        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    // Driver code
    public static void main(String[] args) {
      
        // Create a doubly linked list 
        // with 3 nodes
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        
        head.next = second; 
        second.prev = head;
        second.next = third; 
        third.prev = second;

        System.out.println("Length of doubly linked list: " 
                           + FindLength(head));
    }  
}

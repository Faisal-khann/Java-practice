package LinkedList;

public class Basic {
    // Define head as a member variable
    private Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add -> Add first, last
    public void addFirst(String data) {
        Node newNode = new Node(data); // Create newNode
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data); // Create newNode
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // Print List
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }

    // Delete list first
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        
        head = head.next;
    }

    // Delete last node
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head; // ->currNode
        Node lastNode = head.next; // head.next = null -> lastNode = null
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

    }


    public static void main(String[] args) {
        Basic list = new Basic();
        list.addFirst("tom");
        list.addFirst("alex");
        list.addFirst("harry");
        list.printList();

        list.addLast("d");
        list.printList();

        list.deleteFirst();
        list.printList();

    }
}

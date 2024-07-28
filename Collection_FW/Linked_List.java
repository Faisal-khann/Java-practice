import java.util.*;
public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> al=new LinkedList<>();
        al.add("Tom");
        al.add("Jack");
        al.add("Roy");
        al.add("Jackson");
        System.out.println(al);
        //***Iterate above list
//        Iterator<String> it=al.iterator();
//        while (it.hasNext()){
//            System.out.println("Iteration: "+it.next());
//        }

        //**Add element at index position
        al.add(1, "Charlie");
        System.out.println(al);
        //**Add element at first position
        al.addFirst("SRK");
        System.out.println(al);

        //**Remove element at index position
        al.remove(1);
        System.out.println("After Remove the element at 1st position: "+al);

        //Concept of linked list by using queue data structures
        //Queue implement either by using Array or linked list.
        //offer() is used to add element in queue
        //poll() is used to remove element in queue
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        queue.offer(48);
        System.out.println("Element is: "+ queue);

        System.out.println(queue.poll());
        System.out.println("After removing element :"+queue);

        System.out.println(queue.peek());


    }
}

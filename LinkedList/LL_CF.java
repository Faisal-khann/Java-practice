package LinkedList;

import java.util.*;
// implement Linked list by using collection framework

public class LL_CF {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("Tom");
        list.addFirst("Alex");
        list.addFirst("Harry");
        System.out.println(list);

        list.addLast("Maya");
        list.addLast("Mariyam");
        System.out.println(list);

        System.out.println(list.size());

        //Loop on list -> get element of list
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.print("Null");


        // Delete First and last
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);
    
        
    }
    
}

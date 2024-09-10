import java.util.*;

public class Array_List {
        public static void main(String[] args) {
                // ArrayList<String>studentName = new ArrayList<>();
                 
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(10); // add element
                list.add(20);
                list.add(30);
                list.add(40);
                System.out.println(list);

                //get element
                int result = list.get(3);
                System.out.println(result);

                // add element in specific index
                list.add(1, 15);
                System.out.println(list);

                //set element
                list.set(2, 25);
                System.out.println(list);

                //delete element
                list.remove(1);
                System.out.println(list);



                // Iterate the array list by using for loop, for-each loop and Iterator<>
                /*
                 * for (int i = 0; i<list.size(); i++){
                 * System.out.println("The Element is: "+ list.get(i));
                 * }
                 */

                /*
                 * for(Integer element: list){
                 * System.out.println("for each element is: "+element);
                 * }
                 */

                // Iterator<Integer> it = list.iterator();
                // while (it.hasNext()) {
                //         System.out.println(it.next());
                // }

                // Creating new list and add new list in previous list;
                List<Integer> newList = new ArrayList<Integer>();
                System.out.println("New ArrayList is: ");
                newList.add(110);
                newList.add(120);

                list.addAll(newList); // -> addAll is used to add newlist with old list
                System.out.println(list);

                // list.remove(Integer.valueOf(30));
                // System.out.println(list);

                // list.clear();
                // System.out.println(list);

                // For changing the element of list by using list.set(index, element) method
                // list.set(3, 1000);
                // System.out.println(list);
        
                // System.out.println(list.contains(50));//For checking the element

        }
}

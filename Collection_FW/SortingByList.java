import java.util.*;

public class SortingByList {
    public static void main(String[] args) {
        //Add element in an array
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(45);
        arr.add(35);
        arr.add(25);
        arr.add(15);
        System.out.println("Before sorting : "+arr);
        //sorting is done by using utility method 'Collection.sort();'
        Collections.sort(arr);
        System.out.print("After sorting : " +arr);
//        for (Integer element: arr){
//            System.out.print(" " + element);
//        }

        System.out.println(" ");

        //reverse of an array
        Collections.reverse(arr);
        System.out.println("After Reverse :" +arr);
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer>li = new ArrayList<>();
        li.add(35);
        li.add(25);
        li.add(45);
        li.add(55);
        li.add(15);
        System.out.println("List is: "+li);
        System.out.println("Min Element is: "+ Collections.min(li));
        System.out.println("Max Element is: "+ Collections.max(li));
        System.out.println(Collections.frequency(li,15));
        Collections.sort(li);
        System.out.println("Sorted Element is: "+li);



    }
}

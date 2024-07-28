import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
//        Set<Integer>set = new HashSet<>();
//        Set<Integer>set = new LinkedHashSet<>();
        Set<Integer>set = new TreeSet<>();
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        System.out.println("Element is: "+set);

        set.remove(54);
        System.out.println(set);

        System.out.println(set.contains(25));
        System.out.println(set.isEmpty());
        System.out.println(set.size());

    }
}

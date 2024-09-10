import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        // creating
        HashSet<Integer> set = new HashSet<>();

        // Insert
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(20);
        System.out.println(set);

        // Search -> contain
        if (set.contains(1)) {
            System.out.println("Set Contain 1");
        } else {
            System.out.println("Set doesn't contain 1");
        }

        // delete
        set.remove(20);
        if (!set.contains(20)) {
            System.out.println("Does not contain 20");
        }

        // Iterate
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}

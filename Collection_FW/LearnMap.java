import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
//        Map<String, Integer> num = new HashMap<>();
        Map<String, Integer> num = new TreeMap<>();

        num.put("One", 1);
        num.put("Two", 2);
        num.put("Three", 3);
        num.put("Four", 4);
        num.put("Five", 5);
//        if(!num.containsKey("Two")){
//            num.put("Two", 2);
//        }
        System.out.println("Map is: " +num);
        System.out.println(num.containsValue(2));
        System.out.println(num.isEmpty());
        //Iterate
//        for(Map.Entry<String, Integer> e: num.entrySet()) {
//            System.out.println(e);
//
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }

//        for(String key: num.keySet()){
//            System.out.println(key);
//        }
    }
}

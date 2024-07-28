public class Counter_Demo {
    static int count = 0;
    static void CounterDemo(){ //Define Static Method 
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        CounterDemo(); //Call static method directly without creating an object

    }
}

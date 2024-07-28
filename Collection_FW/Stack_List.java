import java.util.Stack;
public class Stack_List {
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();

        //In stack there is three method which is push, pop and peak()
        animal.push("Lion");
        animal.push("Tiger");
        animal.push("Horse");
        animal.push("Cat");
        System.out.println("Stack is: "+ animal);
        //Peek() define as which element is in top

        System.out.println(animal.peek()); //cat is on top
        animal.pop();

        System.out.println(animal.peek());

    }
}

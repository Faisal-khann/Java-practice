package Oops.Inheritance;

// When a class inherits another class, it is known as a single inheritance.
//In the example given below, Dog class inherits the Animal class, 
//so there is the single inheritance.
class Animal {
    void eat() {
        System.out.println("Eating....");
    }

    void run() {
        System.out.println("Running....");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking....");
    }

    // method override
    void run() {
        System.out.println("Running Fast...");
    }
}

public class Simple {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run();
        d.bark();
    }
}
// javac Oops/Simple.java

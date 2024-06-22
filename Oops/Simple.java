package Oops;
class Animal {
    void eat() {
        System.out.println("Eating....");
    }

    void run() {
        System.out.println("Running....");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking....");
    }

    //method override
    void run(){
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
//javac Oops/Simple.java


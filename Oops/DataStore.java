package Oops;

//Store the data of employee where the data is like 
//employee id, name, salary, and company with the help of constructor.
//All employee work in the same company so, we need to make the company variable as a static variable
//Constructor is call when an object of class is created
class Employee {
    int id;
    String name;
    int salary;
    static String company = "Meksoft";

    // Make constructor
    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID:" + id + ", " + "NAME:" + name + ", " + "SALARY:" + salary + ", " + "COMPANY:" + company);
    }
}

public class DataStore {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Tom", 100000);
        Employee emp2 = new Employee(102, "Alex", 90000);

        emp1.display();
        emp2.display();
    }

}

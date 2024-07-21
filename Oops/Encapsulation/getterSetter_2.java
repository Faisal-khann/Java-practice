package Oops.Encapsulation;
class Person{
    private int id;
    private String name;
    private int salary;

    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }

    public void setSalary(int s){
        this.salary = s;
    }
    public int getSalary(){
        return salary;
    }
}
public class getterSetter_2 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setId(101);
        System.out.println("ID of 1st person is: " + p.getId());

        p.setName("Tom");
        System.out.println("Name of the 1st Person is: "+p.getName());

        p.setSalary(450000);
        System.out.println("Salary of the 1st person is: "+ p.getSalary());

        
    }
}

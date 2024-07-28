//An enum is a special "class" that represents a group of constants(unchangeable variables like final variables).
//To create an enum, use the enum keywords(instead of class or interface), and separate teh constants with
//a comma.


//enum is used either inside the main class or outside the main class

public class Enum {
    public static void main(String[] args) {
        enum cars{
            BMW, TESLA, MERCEDES, bugatti;
        }

        cars myObj1 = cars.bugatti;
        System.out.println(myObj1);
        cars myObj2 = cars.TESLA;
        System.out.println(myObj2);
    }
}

//Practice on method
public class sumByMethod {
    static int add(int a, int b)  //When we do not use void then we need to return value
    {
        int res = a+b;
        System.out.println("The Sum of a + b is "+res);
        return res;
    }
    static void checkAge(int age){
        if (age<18){
            System.out.println("Not Eligible vote vote");
        }
        else {
            System.out.println("Eligible for vote");
        }
    }
    public static void main(String[] args) {
        add(45, 15);
        System.out.println(" ");
        checkAge(55);

    }
}

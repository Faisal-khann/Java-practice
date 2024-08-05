import java.util.*;
public class Method {

    //create method
    static void checkAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of candidate: ");
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("You can eligible for vote");
        }else{
            System.out.println("You are not eligible");
        }

        sc.close();
        
    }
    public static void main(String[] args) {
        // Basic b = new Basic();
        checkAge(); // method calling
    } 
}

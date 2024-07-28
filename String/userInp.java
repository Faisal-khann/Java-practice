import java.util.*;
public class userInp {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the name: ");
//        String name = sc.nextLine();
//        System.out.println("My name is: "+name);
        //concatenation;
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName  = firstName + " "+ lastName;
        System.out.println(fullName);

        System.out.println(" ");

        //charAt() is used to print the character of string
        System.out.println("Print the each character of string fullName");
        for(int i = 0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }


    }
}

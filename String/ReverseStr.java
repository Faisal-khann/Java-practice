import java.lang.*;
import java.util.*;
public class ReverseStr {
    public static void main(String[] args) {
        String str;
        String rev = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        str = sc.nextLine();
        System.out.println("Original String is: "+str);
         //by using decrement for loop;
        for (int i = str.length()-1; i>=0; i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse String is: "+rev);

        //By using string method

        //create stringBuilder class
        StringBuilder sb = new StringBuilder(str);
        String revString = sb.reverse().toString();

        System.out.println("Reversed String : "+revString);
    }
}

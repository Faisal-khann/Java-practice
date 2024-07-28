import java.util.*;

public class loopp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = in.nextInt();
        if (a > 18) {
            System.out.println("you are eligible for marriage");
        } else {
            System.out.println("Not are not eligible for marriage");
        }

        in.close();
    }
}

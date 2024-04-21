
import java.util.*;

public class Factorial {

    // Create Method for Factorial
    public static void findFactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Number: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            // fact = fact * i;
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is : " + fact);
        sc.close();
    }

    public static void main(String[] args) {
        findFactorial();
    }
}

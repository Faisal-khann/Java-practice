//Prime Number is number which is divisible by 1 and its-self.
//Time complexity is : 0(n)
import java.util.*;

public class PrimeNum {
    // Create Method for primeNumber
    public static void primeNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Number: ");
        int num = sc.nextInt();
        int temp = 0;
        for (int i = 2; i <= num - 1; i++) { // Check number is divisible by other number or not
            if (num % i == 0) {
                temp = temp + 1;
            }
        }

        if (temp > 0) {
            System.out.println(num + " is not prime Number ");
        } else {
            System.out.println(num + " is Prime Number ");
        }
        sc.close();
    }

    public static void main(String[] args) {
        primeNumber();
    }
}


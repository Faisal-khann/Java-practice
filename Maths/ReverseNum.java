import java.util.*;

public class ReverseNum {
    public static void revNumber(int x) {
        if (x < 0) {
            System.out.println("Invalid Number");
        }
        int revNum = 0;
        while (x > 0) {
            int last_digit = x % 10;
            revNum = (revNum * 10) + last_digit;
            x = x / 10;
        }
        System.out.println("Reversed Number: " + revNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int x = sc.nextInt();
        revNumber(x);
        sc.close();
    }

}
/* Therory 
    1. First intilize revNum -> 0;
    2. Using While loop
    3. Find the last_digit 
    4. After that find RevNum = (revNum*10) + last_digit;
    5. lastly we increase the value of original number by 10 */ 

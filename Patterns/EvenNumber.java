
// Print even Number pattern with spaces
import java.util.*;

public class Space_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of rows:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) { // k for space
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { // Or we can use decrement loop
                // for (int j = 1; j<=2*i-1; j++){ This loop for odd number patter
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
//     1
//    12
//   123
//  1234
// 12345

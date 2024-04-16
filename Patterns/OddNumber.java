// Print Odd Number Pattern
import java.util.*;
public class OddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of rows:");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            for (int k = 1; k<n-1; k++){
                System.out.print(" ");
            }
            for (int j = 1; j<=2*i-1; j++){
                System.out.print(j+" ");
                // System.out.print("*");
            }
            System.out.println(" ");
        }
       sc.close();
    }
}

// 1  
// 1 2 3  
// 1 2 3 4 5  
// 1 2 3 4 5 6 7  
// 1 2 3 4 5 6 7 8 9

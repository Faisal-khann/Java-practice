import java.util.*;
public class Space_Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of rows");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            for (int k = 1; k<n-1; k++){
                System.out.print(" ");
            }
            for (int j = 1; j<=2*i-1; j++){
                System.out.print(j+ " ");
            }
            System.out.println(" ");
        }
       sc.close();
    }
}

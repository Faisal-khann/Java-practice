import java.util.*;
public class RevRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        //By using decrement for loop
//        for (int i = n; i>=1; i--){
//            for (int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 1; i<=n; i++){
            for (int j=1; j<=n-1+i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

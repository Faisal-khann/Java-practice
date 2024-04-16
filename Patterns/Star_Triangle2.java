import java.util.*;
public class Star_Triangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        //For Rows
        for (int i = 1; i<=n; i++){
        //For space
        for (int j = 1; j<=n-i; j++){
            System.out.print(" ");
        }
        //For star
        for (int k = 1; k<=2*i-1; k++){
            System.out.print("*");
        }
        //For Space
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        //For Lower part
        for (int i = n; i>=1; i--){
            //For space
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //For star
            for (int k = 1; k<=2*i-1; k++){
                System.out.print("*");
            }
            //For Space
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}

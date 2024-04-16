import java.util.Scanner;
public class RightTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of Rows ");
        int n = in.nextInt();
        for (int i = 1; i<=n; i++){   //i for row
            for (int j = 1; j<=i; j++){  //j for column
                System.out.print(j);
//                System.out.print(i);
//                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

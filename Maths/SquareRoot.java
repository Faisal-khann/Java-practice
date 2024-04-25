import java.util.*;
// import java.lang.*; //lang use for mathematics calculation
public class SquareRoot {
    public static void findSquareRoot(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
         //calculating the square of n
         int sqr = (int) Math.pow(n, 2);
         System.out.println("Square of the number "+ n + " is: "+sqr+" ");
 
         //calculating the cube of n
         int cube = (int) Math.pow(n, 3);
         System.out.println("Cube of the number  "+ n +" is: " +cube);

         sc.close();
    }
    public static void main(String[] args) {
        findSquareRoot();
    
    
    }
}

import java.util.*;

public class PyramidFull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = sc.nextInt();
        //For Rows(OUTER LOOP)
        for (int i = 0; i<n; i++){
        //For Space
        for (int j = 0; j<n-i-1; j++){
            System.out.print(" ");
        }
        //For Star
        for (int k = 0; k<2*i+1; k++){
            System.out.print("*");
        }
        //For Space
        for (int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }

            System.out.println(" ");
        }
      sc.close();
    }
}
        //     *     
        //    ***    
        //   *****   
        //  *******
        // *********

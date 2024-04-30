// import java.util.*;

public class PyramidHalf {
    public static void main(String[] args) {
        int n = 4;
        // outer loop for Rows
        for (int i = 1; i <= n; i++) {
            // inner loop for column
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                // System.out.print(j);
                // System.out.print(i);
            }
            System.out.println();
        }
    }
}

// *
// **
// ***
// ****

package Patterns;

import java.util.*;
public class AlphabetPattern {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of rows");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print((char)(96+j)); //typecasting into char
                //unicode: a = 97, b = 98, c = 99,....
            }
            System.out.println(" ");
        }
        sc.close();
    }
}

/* output
a 
ab 
abc 
abcd */
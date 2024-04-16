import java.util.*;

public class Linear_Search2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of an Array");
        int size = sc.nextInt(); //define size of an array
        int[] number = new int[size]; //define array

        //Taking Input from user
        System.out.println("Enter the Element Of an Array");
        for (int i = 0; i<size; i++){
            number[i]= sc.nextInt();
        }

        System.out.println("Enter the Element which we want to search");
        int item = sc.nextInt();
        int temp =0;

        //Output:- for loop is used for Traversing, Searching, Sorting etc
        for (int i = 0; i<size; i++){
            if (number[i] == item){
                System.out.println("Item found at index: "+i);
                temp = temp+1;
            }
        }
        if (temp==0){
            System.out.println("Element Not found in list");
        }
        sc.close(); //Closing the scanner class
    }
}

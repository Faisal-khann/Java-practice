import java.util.Arrays;
import java.util.Scanner;

public class Bs_1 {
    public static void binarySearch(int[]arr) { //Methods for binary search
        int beg = 0;
        int end = arr.length - 1;
        int mid = (beg + end) / 2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the item you want to search: ");
        int item = in.nextInt();
        while (beg <= end) {
            if (item == arr[mid]) {
                System.out.println("Item found at " + mid + " position");
                break;
            } else if (item > arr[mid]) {
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (beg + end) / 2;
        }
        if (beg > end) {

            System.out.println("Element not found ");
        }
        in.close();
    }
    public static void main(String[] args) {
        int []arr ={15, 25, 35, 45, 65};
        System.out.println("Given Array is: "+Arrays.toString(arr));
         binarySearch(arr);
         //*****For Direct Sorting**********
//        Arrays.sort(arr);
//        System.out.println("After Sorting: "+Arrays.toString(arr));
    }
}

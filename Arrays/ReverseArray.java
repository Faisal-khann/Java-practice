
//Perform Reverse Array by using while loop
//Time complexity -> 0(n)
import java.util.Arrays;

public class ReverseArray {
    public static void myReverse(int[] arr, int n) // Method for swapping
    {
        int start = 0;
        int end = n - 1;

        while (start < end) { // Swapping
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 9, 12 };
        int n = arr.length;
        System.out.println("Original Array:" + Arrays.toString(arr));
        myReverse(arr, n);
        System.out.println("After reverse:" + Arrays.toString(arr));
    }
}
// Reverse an element of array by using decrement for loop also
// System.out.print("After Reverse: ");
// for (int i = arr.length-1; i>=0; i-- ){
// System.out.print(arr[i]+ " ");
// }

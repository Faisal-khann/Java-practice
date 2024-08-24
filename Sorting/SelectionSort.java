import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            int min = i; // Set minimum element at 0th index of an array;
            for (int j = i + 1; j < n; j++) { // J loop for comparison and value of j is always start
                // with (i+1)th index bcz we assume '0th' index is minimum element
                if (arr[min] > arr[j]) { // check smallest element
                    min = j;
                }
            }
            // Swapping with min ith element
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;

            }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 25, 35, 15, 55, 45 };
        int n = arr.length;
        System.out.println("Array Before Sorting: " + Arrays.toString(arr));

        // Calling selectionSort method
        selectionSort(arr, n);
        System.out.println("Array After Sorting: " + Arrays.toString(arr));
    }
}

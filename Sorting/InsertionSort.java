import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) { // Run loop on unsorted part
            int temp = arr[i]; // First element of unsorted part ex:- '11'
            int j = i - 1; // This is used for previous element of key value ex:- '12';

            while (j >= 0 && arr[j] > temp) { // Used for comparison of j and key value 0
                arr[j + 1] = arr[j]; // Swap
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };
        int n = arr.length;

        System.out.println("Arrays Before sorting:" + Arrays.toString(arr));
        insertionSort(arr, n);
        System.out.println("Arrays After sorting: " + Arrays.toString(arr));
    }
}

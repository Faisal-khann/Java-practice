import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) { // Run loop on unsorted part
            int key = arr[i]; // First element of unsorted part ex:- '11'
            int j = i - 1; // This is used for previous element of key value ex:- '12';

            while (j >= 0 && arr[j] > key) { // Used for comparison of j and key value 0
                arr[j] = arr[j+1]; // Swap
                j--;
            }
            arr[j + 1] = key;
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

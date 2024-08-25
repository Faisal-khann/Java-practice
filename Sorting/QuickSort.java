import java.util.Arrays;
public class QuickSort {
    // Partition method to rearrange the array
    static int partition(int[] a, int start, int end) {
        int pivot = a[start];
        int i = start;
        int j = end;

        while (i < j) {
            // Move 'i' to the right while elements are less than or equal to the pivot
            // Ensure 'i' does not go out of bounds
            while (i < end && a[i] <= pivot) {
                i++;
            }
            // Move 'j' to the left while elements are greater than the pivot
            // Ensure 'j' does not go out of bounds
            while (j > start && a[j] > pivot) {
                j--;
            }
            // Swap elements if indices haven't crossed
            if (i < j) {
                swap(a, i, j);
            }
        }
        // Place pivot in the correct position
        swap(a, j, start);
        return j;
    }

    // Method to swap two elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Recursive method to apply QuickSort on subarrays
    static void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(a, start, end);
            
            // Recursively sort elements before and after the pivot
            quickSort(a, start, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 7, 9, 3};
        int n = arr.length;

        System.out.println("Array before sorting:" +Arrays.toString(arr));
        
        quickSort(arr, 0, n - 1);
        System.out.println("Array after sorting:" +Arrays.toString(arr));

        // // Print the sorted array
        // System.out.println("Array after sorting:");
        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }
    }
}

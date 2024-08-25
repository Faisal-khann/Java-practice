public class QuickSort {
    // Partition method to rearrange the array
    static int partition(int[] a, int l, int h) {
        int pivot = a[l];
        int i = l;
        int j = h;

        while (i < j) {
            // Move 'i' to the right while elements are less than or equal to the pivot
            // Ensure 'i' does not go out of bounds
            while (i < h && a[i] <= pivot) {
                i++;
            }
            // Move 'j' to the left while elements are greater than the pivot
            // Ensure 'j' does not go out of bounds
            while (j > l && a[j] > pivot) {
                j--;
            }
            // Swap elements if indices haven't crossed
            if (i < j) {
                swap(a, i, j);
            }
        }
        // Place pivot in the correct position
        swap(a, j, l);
        return j;
    }

    // Method to swap two elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Recursive method to apply QuickSort on subarrays
    static void quickSort(int[] a, int l, int h) {
        if (l < h) {
            int pivotIndex = partition(a, l, h);
            // Recursively sort elements before and after the pivot
            quickSort(a, l, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, h);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 7, 9, 3};
        int n = arr.length;
        
        // Print the array before sorting
        System.out.println("Array before sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Apply QuickSort
        quickSort(arr, 0, n - 1);

        // Print the sorted array
        System.out.println("Array after sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

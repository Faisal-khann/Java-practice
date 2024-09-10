import java.util.*;

public class MergeSort2 {
    // Divide method for splitting the array
    public static void divide(int[] arr, int l, int r) {
        // Base case: if the left index is greater than or equal to the right index, stop recursion
        if (l >= r) {
            return;
        }

        // Find the middle point
        int mid = l + (r - l) / 2;

        // Recursively divide the left half and right half
        divide(arr, l, mid);
        divide(arr, mid + 1, r);

        // Merge the divided arrays
        conquer(arr, l, r);
    }

    // Conquer method for merging two sorted arrays
    public static void conquer(int[] arr, int l, int r) {
        int mid = l + (r - l) / 2;
        int len1 = mid - l + 1;
        int len2 = r - mid;

        // Create two temporary arrays to hold the split elements
        int[] first = new int[len1];
        int[] second = new int[len2];

        // Copy data to temp arrays
        int k = l;
        for (int i = 0; i < len1; i++) {
            first[i] = arr[k++];
        }

        int K = mid + 1;
        for (int i = 0; i < len2; i++) {
            second[i] = arr[K++];
        }

        // Merge the two sorted arrays into the main array
        int indx1 = 0, indx2 = 0;
        int mainArrayIndex = l;
        while (indx1 < len1 && indx2 < len2) {
            if (first[indx1] < second[indx2]) {
                arr[mainArrayIndex++] = first[indx1++];
            } else {
                arr[mainArrayIndex++] = second[indx2++];
            }
        }

        // Copy remaining elements of first array, if any
        while (indx1 < len1) {
            arr[mainArrayIndex++] = first[indx1++];
        }

        // Copy remaining elements of second array, if any
        while (indx2 < len2) {
            arr[mainArrayIndex++] = second[indx2++];
        }
    }

    public static void main(String[] args) {
        int arr[] = {24, 12, 60, 48, 36};
        int n = arr.length;
        System.out.println("Before Sorting: " + Arrays.toString(arr));

        // Call the divide function to initiate merge sort
        divide(arr, 0, n - 1);

        // Print the sorted array
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}

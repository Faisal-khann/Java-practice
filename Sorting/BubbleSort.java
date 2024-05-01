import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) // Methods for BubbleSort
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 25, 15, 35, 55, 45 };
        // System.out.println("Before Sorting:" + Arrays.toString(arr));

        // Calling the Method bubbleSort
        bubbleSort(arr);
        System.out.println("After Sorting:" + Arrays.toString(arr));
    }
}

// **********Theory of Bubble Sort*********
// No of element of array is n then no of passes(i) is n-1;
// Size of array is arr.length then no of passes(i) is arr.length-1;
// J always start from 0 index and goes to (n-1-i) as last element of arr[] is
// sorted after each pass(i);

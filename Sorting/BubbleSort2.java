import java.util.Arrays;

public class BubbleSort2 {
    public static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr, j + 1, j);
                }
            }
        }
    }

    // Method to swap two elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 25, 15, 35, 45, 10 };
        int n = arr.length;

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        bubbleSort(arr, n);
        System.out.println("After sorting: " + Arrays.toString(arr));

    }

}

import java.util.Arrays;

public class RotateArray {
    public static void myRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // Ensure k is within bounds
        reverse(arr, 0, n - 1);   // Reverse the entire array
        reverse(arr, 0, k - 1);   // Reverse the first part
        reverse(arr, k, n - 1);   // Reverse the second part
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {  // Swap elements from start to end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Before Rotate: " + Arrays.toString(arr));

        myRotate(arr, k);

        System.out.println("After Rotate: " + Arrays.toString(arr));
    }
}

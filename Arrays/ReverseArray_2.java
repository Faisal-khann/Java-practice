import java.util.Arrays;

public class ReverseArray_2 {
    public static void myReverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Perform swapping
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 9, 12 };
        System.out.println("Original Array:" + Arrays.toString(arr));
        myReverse(arr);
        System.out.println("After reverse:" + Arrays.toString(arr));
    }

}

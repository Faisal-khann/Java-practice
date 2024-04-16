import java.util.Arrays;
//Swapping the element of an array
public class Swapping {
    public static void swap(int[]arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12};
        swap(arr, 1, 3);
        System.out.println("After Swapping: " + Arrays.toString(arr));
    }
}

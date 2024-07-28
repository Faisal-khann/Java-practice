import java.util.Arrays;

public class Arrays_Class {
    public static void main(String[] args) {
//        int[] arr = {5, 15, 25, 35, 45};
        //*******Binary search*******
//        int index = Arrays.binarySearch(arr, 45);
//        System.out.println("The index of element 45 is: "+index);

        //*******Sorting********
        int[] arr = {15, 5, 45, 25, 35};
        System.out.println("Before Sorting: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}

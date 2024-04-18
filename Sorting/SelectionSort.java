import java.util.Arrays;
public class SelectionSort {
    public static void selectionSort(int[]arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int smallest = i; //Set smallest element at 0th index of an array;
              for (int j = i+1; j < n; j++ ) {  // J loop for comparison and value of j is always start
                // with (i+1)th index bcz we assume '0th' index is minimum element
                if (arr[smallest] > arr[j]){ //check smallest element
                    smallest = j;
                }
            }
              //Swapping with min ith element
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[]arr={25, 35, 15, 55, 45};
        System.out.println("Array Before Sorting: "+Arrays.toString(arr));

        //Calling selectionSort method
        selectionSort(arr);
        System.out.println("Array After Sorting: "+Arrays.toString(arr));
    }
}

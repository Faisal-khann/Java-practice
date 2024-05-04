// import java.lang.reflect.Array;
import java.util.Arrays;
public class MaximumElement {
    // This Method take less time complexity and the time complexity is o(n)
//    public static int max(int[]arr){
//        int maxVal = arr[0]; //Assume Max value in 0th index
//        for (int i = 1; i< arr.length; i++){
//            if (arr[i]>maxVal){
//                maxVal = arr[i];
//            }
//        }
//        return maxVal;
//    }
    public static void main(String[] args) {
        int[]arr = {4, 16, 12, 20, 8 };
        System.out.println("Original Array: "+Arrays.toString(arr));
//        System.out.println("Given Arrays: "+ Arrays.toString(arr));
//        System.out.println("Maximum element: "+max(arr));
        Arrays.sort(arr);
        System.out.println("After Sorting: "+ Arrays.toString(arr));
        int maxVal = arr[arr.length-1];
        System.out.println("Maximum Element is: "+maxVal);
    }
}
//method 1 : First we sort the Arrays by using sort() method then set the index of max element
//Method 2 : Using for loop and assume max element is in oth index of an array and after
// compare the max element with current pos of an array and return the maxVal

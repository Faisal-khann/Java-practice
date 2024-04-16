import java.util.Arrays;
public class ReverseArrays {
    public static void printArray(int[]arr){
//        System.out.println("Before Reverse: "+ Arrays.toString(arr));
        System.out.print("Before Reverse: ");
        for (int i = 0; i<= arr.length-1; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
        System.out.print("After Reverse: ");
        for (int i = arr.length-1; i>=0; i-- ){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int []arr ={10, 15, 20, 25};
        printArray(arr);
    }
}

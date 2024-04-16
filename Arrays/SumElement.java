import java.util.Arrays;
public class SumElement {
    public static void main(String[] args) {
        int arr[] = {10, 5, 20, 4};
        System.out.println("The Element of an Array is: "+Arrays.toString(arr));
        int sum = 0;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            sum = sum + arr[i];
        }
        System.out.println("The Sum of Element of an Array is: " +"("+sum+")");
    }
}

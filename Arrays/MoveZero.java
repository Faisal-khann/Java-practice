
//Program of Move zero at the end of the element
//[0, 2, 0, 4, 5] -> [2, 4, 5, 0, 0] 
//Time complexity -> 0(n)
import java.util.*;

public class MoveZero {
    static void moveZero(int[] arr, int n) {
        int zero = 0; //Take pivot element as 0
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) { 
                zero++;
            } else {
                int temp = arr[i];
                arr[i] = 0;
                arr[i - zero] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 0, 4, 5 };
        int n = arr.length;
        System.out.println("Before Moving: " + Arrays.toString(arr));
        moveZero(arr, n);
        System.out.println("After Moving: " + Arrays.toString(arr));

    }

}

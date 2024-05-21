public class MinimumElement {
    static int findSmallestElement(int[] arr) {
        int minVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        return minVal;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 9};
        System.out.println("The Smallest Element is: " + findSmallestElement(arr));
    }
}
/*Time Complexity: O(N)
Space Complexity: O(1) */
/*      Approach
:-Create a min variable and initialize it with arr[0].
:-Use a for loop and compare it with other elements of the array
:-If any element is less than the min value, update min value with element’s value
:-Print the min variable.
 */

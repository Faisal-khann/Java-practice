public class SmallestElement {
    static int findSmallestElement(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 9};
        System.out.println("The Smallest Element is: " + findSmallestElement(arr));
    }
}

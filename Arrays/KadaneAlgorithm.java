//Maximum sum sub Arrays for both positive and negative test cases
public class KadaneAlgorithm {
    static int maxSumSubArray(int[] arr, int n) {
        // Max_so_far = maxSum
        // Max_ending_here = curSum
        int maxSum = 0;
        int curSum = 0;
        for (int i = 0; i < n; i++) {
            curSum = curSum + arr[i];
            if (curSum < arr[i]) {
                curSum = arr[i];
            }
            if (maxSum < curSum) {
                maxSum = curSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 5, -4, -2, 6, -1 };
        int n = arr.length;
        System.out.println("Maximum Sum of Sub Array is:" + maxSumSubArray(arr, n));
    }
}

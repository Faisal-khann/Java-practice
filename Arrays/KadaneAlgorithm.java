//Maximum sum sub Arrays
public class KadaneAlgorithm {
    static int maxSumSubArray(int[]arr) {
        int maxSum = 0;
        int curSum = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum = curSum + arr[i];
            if(curSum > maxSum) {
                maxSum = curSum;
            }
            // Check for negative element
            if(curSum < 0){
                curSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[]arr = {5, -4, -2, 6, -1};
        System.out.println("Maximum Sum of Sub Array is:"+maxSumSubArray(arr));
    }
}

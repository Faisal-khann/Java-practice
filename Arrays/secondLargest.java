public class secondLargest {
    public static void SecondLargest(int[]arr, int n){
        if (n<2){
            System.out.printf("Invalid input");
            return;
        }
        int first = arr[0], second = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++){
            if (arr[i]>first){
                second = first;
                first = arr[i];
            }
            else if (arr[i]>second){
                second = arr[i];
            }
        }
        System.out.println("Second largest element is: " +second);
    }
    public static void main(String[] args) {
        int[]arr = {12, 35, 1, 10, 34, 1};
        int n = arr.length;
        SecondLargest(arr, n);

    }
}

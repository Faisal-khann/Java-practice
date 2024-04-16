public class secondLargest2 {
    static void secondLar(int[]arr, int arr_size){
        if (arr_size<2){
            System.out.printf("Invalid input");
            return;
        }
        int largest = Integer.MIN_VALUE, second_largest = Integer.MIN_VALUE;
        for (int i = 0; i<arr_size; i++){
            if (arr[i]>largest){
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] > second_largest && arr[i]!= largest){
                second_largest = arr[i];
            }
        }
        if (second_largest == Integer.MIN_VALUE){
            System.out.println("There is no second largest");
        }
        else {
            System.out.println("Second largest value is:"+ second_largest);
        }
    }
    public static void main(String[] args) {
        int[]arr = {10, 15, 10};
        int n = arr.length;
        secondLar(arr, n);

    }
}

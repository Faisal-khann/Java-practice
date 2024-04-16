public class ThirdLargest {
    public static void thirdLargest(int[]arr, int arr_size){
        if ( arr_size < 3){
            System.out.printf("Invalid Input");
            return;
        }
        // Initialize first, second, and 3rd largest element
        int first = arr[0], second = Integer.MIN_VALUE,
                            third = Integer.MIN_VALUE;
        for(int i = 0; i<arr_size; i++){
            if (arr[i]>first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i]>second){
                third = second;
                second = arr[i];
            }
            else if(arr[i]>third){
                third = arr[i];
            }
        }
        System.out.println("Third Largest Element: "+third);
    }
    public static void main(String[] args) {
        int[]arr = {7, 6, 8, 5, 4};
        int n = arr.length;
        thirdLargest(arr, n);
    }
}

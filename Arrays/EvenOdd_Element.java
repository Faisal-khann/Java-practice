//Print the element of an array present on even position
public class EvenOdd_Element {
    public static void main(String[] args) {
        int[]arr = {15, 25, 35, 45};
        System.out.println("Elements of given array present on even position");
        for (int i = 1; i< arr.length; i=i+2 ){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

//        Print the element of an array present on odd position
        System.out.println("Elements of given array present on odd position");
        for (int i = 0; i< arr.length; i = i+2){
            System.out.print(arr[i]+" ");
        }
    }
}

import java.util.Arrays;
public class MinMaxElement {
    public static void main(String[] args) {
        int[]arr={55,65,45,35,75,25,15,85,5};
        //Method 1 : Simple Method;
//        int max = arr[0];
//        int min = arr[0];
//        for (int val: arr){
//            if (max<val){
//                max=val;
//            }else {
//                min = val;
//            }
//            if (min>val){
//                min=val;
//            }
//        }
//        int span = max-min;
//        System.out.println("Maximum Element: "+max);
//        System.out.println("Minimum Element: "+min);
//        System.out.println("Span Element: "+span);

        //Method 2 : By using Arrays.sort();
        Arrays.sort(arr); //Sort in Ascending order
        for (int val: arr){
            System.out.print(val + ",");
        }
        int min = arr[0];
        int max = arr[arr.length-1];
        int span = max-min;
        System.out.println(" ");
        System.out.println("Maximum Element: "+max);
        System.out.println("Minimum Element: "+min);
        System.out.println("Span Element: "+span);



    }
}

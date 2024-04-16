public class Inverted_HalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        //Method 1:- This is the best case
        System.out.println("Method 1 where we use j=1 to n-i+1");
        for (int i = 1; i<=n; i++){
            for (int  j = 1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //Method 2
        System.out.println("Method 2 where we use decrement for loop");
        for (int i = n; i>=1; i--){
            for (int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
/*
* 1 2 3 4 5
* 1 2 3 4
* 1 2 3
* 1 2
* 1
* */

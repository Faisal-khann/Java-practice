public class Butterfly {
    public static void main(String[] args) {
        int n = 4;
        //upper half
        for (int i = 1; i<=n; i++){
            //1st part star
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            //Spaces
            int spaces = 2*(n-i);
            for (int j = 1; j<=spaces; j++){
                System.out.print(" ");
            }
            //2nd part star
//            for (int j = 1; j<=i; j++){
            for (int j = i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for (int i = n; i>=1; i--){
            //1st part star
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            //Spaces
            int spaces = 2*(n-i);
            for (int j = 1; j<=spaces; j++){
                System.out.print(" ");
            }
            //2nd part star
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

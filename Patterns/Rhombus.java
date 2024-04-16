public class Rhombus {
    public static void main(String[] args) {
        int n = 5;
        for (int i=1; i<=n; i++){
            //For space
            for (int s=1; s<=n-i; s++) {
                System.out.print(" ");
            }
                //For star
                for (int j=1; j<=5; j++){
                    System.out.print("*");
                }
                System.out.println();
        }

    }
}

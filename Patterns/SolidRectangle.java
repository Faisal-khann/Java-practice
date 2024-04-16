public class SolidRectangle {
    public static void main(String[] args) {
        int n = 4; //Rows
        int m = 5; //Column
        //Solid Rectangle
        System.out.println("This is the Solid Rectangle");
        for (int i=1; i<=n; i++){
            for (int j = 1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //Hollow rectangle
        System.out.println("This is the Hollow Rectangle");
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=m; j++){
                if (i ==1 || j ==1 || i==n || j==m){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

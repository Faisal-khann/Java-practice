public class NestedLoop {
    public static void main(String[] args) {
//        for (int i = 0; i<5; i++){
//            System.out.println(i);
//              for (int j = 0; j<5; j++){
//                  System.out.println(j);
//              }
//        }
        //print star pattern in square
        for (int row = 1; row<=5; row++){
            for(int col = 1; col<=5; col++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}

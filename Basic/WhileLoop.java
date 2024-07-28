public class WhileLoop {
    public static void main(String[] args) {
//        boolean b1 = true;
//        int i = 0;
//        while (i<5){
//            System.out.println("Hello charlie");
//            i++;
//            break;
        int i = 1, j=10;
        do {
            if (i++>--j){
                continue;
            }
        }while (i<5);
        System.out.println("i= "+i+ "and j="+j);
        }
    }

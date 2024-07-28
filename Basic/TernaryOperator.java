public class TernaryOperator {
    public static void main(String[] args) {

//        if(2>3){
//            System.out.println("True");
//        }else {
//            System.out.println("False");
//        }

        boolean b1 = (2>3)? true : false;
        System.out.println(b1);

        int res = (2<3)? 2+3 : 2-3;
        System.out.println(res);

        //find even number by using ternary operator
        int num = 45;
        boolean even = (num %2==0) ? true : false;
        System.out.println(even);
    }
}

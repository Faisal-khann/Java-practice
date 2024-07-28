public class ReverseString {
    public static void main(String[] args) {
        String A = "faisal";
        System.out.println("Original String is: "+A);

        //Reverse String by using String Method()
        String B = new StringBuilder(A).reverse().toString();
        System.out.println("Reverse String is: "+B);

    }
}

public class palindromeStr {
    public static void main(String[] args) {
        String A = "Madam";
        String B = new StringBuilder(A).reverse().toString();//method for reverse
        System.out.println("Reverse String is:"+B);

        if(A.equals(B)){
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}

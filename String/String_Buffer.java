import java.lang.*;
public class String_Buffer {
    public static void main(String[] args) { 
        StringBuffer sb = new StringBuffer("programming");
        System.out.println("Length of sb stringBuffer is: "+sb.length());
//        System.out.println(sb.append("khan"));
        System.out.println(sb.indexOf("g"));
        System.out.println(sb.charAt(4));
        System.out.println(sb.lastIndexOf("g"));
        System.out.println("Character at 3rd index of sb stringBuffer is: "+sb.charAt(3));

        //Reverse of sb string by using string buffer
        System.out.println("Reversed string is: "+sb.reverse());
    }
}

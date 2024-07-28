//import java.util.Locale;

public class MyCharacter {
    public static void main(String[] args) {

        // 1.Finding the length of string by using length() method.
        String txt = "object oriented";
        System.out.println("The length of txt string " +txt.length());

        // 2.Concatenation of string by using '+' operator and by using 'concat()' method.
        String str1 = "John";
        String str2 = "Doe";
        System.out.println(str1+str2);
        //System.out.println(str1.concat(str2));

        // if we want to write string in capital letter then we use toUpperCase() method
        //if we want to write string in lower letter then we use toLowerCase() method
        String s = "Faisal khan";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        String name = "King khan";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String n = "java is an object oriented language";
        System.out.println("The position of object in above string is : " +n.indexOf("object"));
//        System.out.println(n.indexOf("object"));


    }
}

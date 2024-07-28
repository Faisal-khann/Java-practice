public class Creation_str {
    public static void main(String[] args) {
        String s1 = "FaisalKhan"; //creating string by using string literal
        String s2 = new String("Charlie"); //creating string by using new keyword
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(" ");

        System.out.println("Converting char array to string:");
        char ch[] = {'j','a', 'v', 'a'};
        String s3 = new String(ch);
        System.out.println(s3);

        System.out.println(" ");

        //Test immutable String
        String s4 = "java";
//        s4.concat("language"); this is not directly work as we don't change in the original string;
       s4= s4.concat("language");
        System.out.println(s4);
        System.out.println("Length of String is: "+s4.length());
    }
}

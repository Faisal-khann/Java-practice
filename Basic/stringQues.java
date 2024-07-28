public class stringQues {
    public static void main(String[] args) {
        // Problem 1: Write a Java program to convert a string to lowercase and uppercase.
        String name = "Jack Parker";
//        name = name.toLowerCase();
//        name = name.toUpperCase();
//        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        // Problem 2: Write a Java program to replace spaces with underscores.
        String text = "i am the best   coder";
        text = text.replace(" ", "_");
        System.out.println(text);
//        System.out.println(text.replace(" ", "_")); hum es trah bhi dikha skte hai

        // Problem 3
//        String letter = "Dear <|name|>, Thanks a lot!";
//        letter = letter.replace("<|name|>", "Sachin");
//        System.out.println(letter);

        // Problem 4
        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5: Write a program to format the following letter using escape sequence characters.
        //Letter = “Dear Harry, This Java Course is nice. Thanks”
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);
    }
}

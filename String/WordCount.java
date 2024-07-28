import java.util.*;
public class WordCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Str;
        char ch;
        int  wordCount = 0;
        System.out.println("Enter the Sentence:");
        Str = in.nextLine();
        for (int i =0; i<Str.length(); i++){
            ch = Str.charAt(i); //Print Number of character
            if (ch== ' ') //calculating white space as white space is also include in word count
            {
                wordCount++; //if white space is 2 then wordCount is 3......
            }
        }
        wordCount = wordCount+1; //word count
        int c = Str.length()- wordCount; //character count
        System.out.println("Original sentence: "+Str);
        System.out.println("No of words is: " +wordCount);
//        System.out.println("No of character is: "+c);
        System.out.println("Length of sentence is: "+Str.length());
    }
}

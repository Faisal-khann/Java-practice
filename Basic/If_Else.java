import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Age of person");
        int myAge = input.nextInt();
        // int myAge = 18;
        if (myAge > 18) {
            System.out.println("Old enough to vote ");
        } else {
            System.out.println("Not enough to vote");
        }

        input.close();
    }
}

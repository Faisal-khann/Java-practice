
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        while (true) {
            // Get user input
            System.out.println("Enter your choice (0 for Rock, 1 for Paper, 2 for Scissors, or any other key to quit): ");
            int userChoice;
            try {
                userChoice = scanner.nextInt();
            } catch (Exception e) {
                break;
            }

            // Check if user input is valid
            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid input! Please enter 0, 1, or 2.");
                continue;
            }

            // Generate computer's choice
            int computerChoice = random.nextInt(3);

            // Display choices
            System.out.println("Your choice: " + choices[userChoice]);
            System.out.println("Computer's choice: " + choices[computerChoice]);

            // Determine the winner
            if (userChoice == computerChoice) {
                System.out.println("It's a draw!");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                       (userChoice == 1 && computerChoice == 0) ||
                       (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}

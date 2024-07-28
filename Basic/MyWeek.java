import java.util.Scanner;

public class MyWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int day = input.nextInt();

        if (day == 1) {
            System.out.println("MONDAY");
        } else if (day == 2) {
            System.out.println("TUESDAY");
        } else if (day == 3) {
            System.out.println("WEDNESDAY");
        } else if (day == 4) {
            System.out.println("THURSDAY");
        } else if (day == 5) {
            System.out.println("FRIDAY");
        } else if (day == 6) {
            System.out.println("SATURDAY");
        } else if (day == 7) {
            System.out.println("SUNDAY");
        } else {
            System.out.println("Invalid Day");
        }

        input.close();

    }
}

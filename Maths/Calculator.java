import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;

        // Create an object of scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Choose an operator: [ +, -, *, or / ]:");
        operator = input.next().charAt(0);

        System.out.print("Enter first number:- ");
        number1 = input.nextDouble();

        System.out.print("Enter second number:- ");
        number2 = input.nextDouble();

        switch (operator) {
            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println("Addition is: ");
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println("Subtraction is: ");
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println("Multiplication is: ");
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.println("Division is: ");
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
        input.close();
    }
}

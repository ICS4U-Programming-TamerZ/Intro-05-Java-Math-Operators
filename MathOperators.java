/**
 * Prints Hello world with Style.
 *
 * @author Tamer
 * @version 1.0
 * @since 2024/02/11
 */

// Imports Utility
import java.util.Scanner;

// Main Class
public final class MathOperators {
    
    // Private constructor to prevent instantiation
    private MathOperators() {
        throw new AssertionError("Utility class should not be instantiated");
    }
    
    // Main Input method
    public static void main(String[] args) {
        // Input scanner
        final Scanner sc = new Scanner(System.in);
        while (true) {
            // Declaring Variables
            double firstNum, secondNum;
            double sum = 0, difference = 0, product = 0, remainder = 0, power = 0;
            // Asks user what operation they want to complete
            System.out.println("What Operation would you like to do? (+, -, *, /, ^, sqrt)");
            // Gets user input for operation
            final String operationType = sc.nextLine();
            try {
                // Asks user for their first number
                System.out.print("Enter your First number: ");
                // Scans first number
                firstNum = sc.nextDouble();
                // Asks user for their second number
                System.out.print("Enter your Second number: ");
                // Scans second number
                secondNum = sc.nextDouble();
            } catch (Exception ex) {
                // Display error message
                System.out.println("Invalid input: " + ex.getMessage());
                break;
            }
            // If user chose Addition
            if (operationType.equals("+")) {
                // Finds Sum and displays it.
                sum = firstNum + secondNum;
                System.out.println("Your Sum for " + firstNum + " + " + secondNum + " is " + sum);
                break;
            } else if (operationType.equals("-")) {
                // Finds Difference and displays it.
                difference = firstNum - secondNum;
                System.out.println(
                        "Your Difference for " + firstNum + " - " + secondNum + " is " + difference);
                break;
            } else if (operationType.equals("*")) {
                // Finds Product and displays it.
                product = firstNum * secondNum;
                System.out.println("Your Product for " + firstNum + " * " + secondNum + " is " + product);
                break;
            } else if (operationType.equals("/")) {
                // Finds Remainder and displays it.
                remainder = firstNum / secondNum;
                System.out.println(
                        "Your Remainder for " + firstNum + " / " + secondNum + " is " + remainder);
                break;
            } else if (operationType.equals("^")) {
                // Finds Power and displays it.
                power = Math.pow(firstNum, secondNum);
                System.out.println("Your Power of " + firstNum + " ^ " + secondNum + " is " + power);
                break;
            } else if (operationType.equals("sqrt")) {
                // Finds squareRoot1 and squareRoot2 and displays it.
                double squareRoot1 = Math.sqrt(firstNum);
                double squareRoot2 = Math.sqrt(secondNum);
                System.out.println("Square root of " + firstNum + " is " + squareRoot1);
                System.out.println("Square root of " + secondNum + " is " + squareRoot2);
                break;
            } else {
                System.out.println("Please provide a valid Input");
            }
        }
        sc.close();
    }
}

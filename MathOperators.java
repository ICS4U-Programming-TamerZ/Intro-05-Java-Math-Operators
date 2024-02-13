/**
 * Prints Hello world with Style.
 *
 * @author Tamer
 * @version 1.0
 * @since 2024/02/11
 */

// Imports Utility
import java.util.*;

// Main Class
public class MathOperators {
  // Main Input method
  public static void main(String[] args) {
    // Input scanner
    Scanner sc = new Scanner(System.in);
    while (true) {
      // Declaring Variables
      double FirstNum, SecondNum;
      double Sum, Difference, Product, Remainder, Power;
      // Asks user what operation they want to complete
      System.out.println("What Operation would you like to do? (+, -, *, /, ^, sqrt)");
      // Gets user input for operation
      String OperationType = sc.nextLine();
      try {
        // Asks user for their first number
        System.out.print("Enter your First number: ");
        // Scans first number
        FirstNum = sc.nextDouble();
        // Asks user for their second number
        System.out.print("Enter your Second number: ");
        // Scans second number
        SecondNum = sc.nextDouble();
        // If any error is found
      } catch (Exception e) {
        // Display error message
        System.out.println("Invalid, " + e.getMessage());
        break;
      }
      // If user chose Addition
      if (OperationType.equals("+")) {
        // Finds Sum and displays it.
        Sum = FirstNum + SecondNum;
        System.out.println("Your Sum for " + FirstNum + " + " + SecondNum + " is " + Sum);
        break;
        // If user chose Subtraction
      } else if (OperationType.equals("-")) {
        // Finds Difference and displays it.
        Difference = FirstNum - SecondNum;
        System.out.println(
            "Your Difference for " + FirstNum + " - " + SecondNum + " is " + Difference);
        break;
        // If user chose Multiplication
      } else if (OperationType.equals("*")) {
        // Finds Product and displays it.
        Product = FirstNum * SecondNum;
        System.out.println("Your Product for " + FirstNum + " * " + SecondNum + " is " + Product);
        break;
        // If user chose Division
      } else if (OperationType.equals("/")) {
        // Finds Remainder and displays it.
        Remainder = FirstNum / SecondNum;
        System.out.println(
            "Your Remainder for " + FirstNum + " / " + SecondNum + " is " + Remainder);
        break;
        // If user chose power
      } else if (OperationType.equals("^")) {
        // Finds Power and displays it.
        Power = StrictMath.pow(FirstNum, SecondNum);
        System.out.println("Your Power of " + FirstNum + " ^ " + SecondNum + " is " + Power);
        break;
        // If user chose square root
      } else if (OperationType.equals("sqrt")) {
        // Finds squareRoot1 and squareRoot2 and displays it.
        double squareRoot1 = StrictMath.sqrt(FirstNum);
        double squareRoot2 = StrictMath.sqrt(SecondNum);
        System.out.println("Square root of " + FirstNum + " is " + squareRoot1);
        System.out.println("Square root of " + SecondNum + " is " + squareRoot2);
        break;
        // If Invalid Input is given
      } else {
        System.out.println("Please provide a valid Input");
      }
    }
  }
}

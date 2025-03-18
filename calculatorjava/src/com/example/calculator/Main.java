// File: Main.java
// Package declaration for grouping related classes.
package com.example.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main class to run the Calculator App.
 */
public class Main {

    public static void main(String[] args) {
        // Instantiate the Calculator object to perform arithmetic operations.
        Calculator calculator = new Calculator();

        // Create a Scanner object to handle user input.
        Scanner scanner = new Scanner(System.in);

        // Boolean flag to control the continuation of the calculator session.
        boolean continueCalculating = true;

        // Main loop: runs until the user chooses to exit.
        while (continueCalculating) {
            // Display the calculator menu.
            System.out.println("\nWelcome to the Java Calculator App");
            System.out.println("Choose an operation:");
            System.out.println("1) Add");
            System.out.println("2) Subtract");
            System.out.println("3) Multiply");
            System.out.println("4) Divide");
            System.out.println("5) Power (a^b)");
            System.out.println("6) Square Root");
            System.out.println("7) Exit");

            int choice = 0;
            // Input validation loop for the user's menu choice.
            while (true) {
                System.out.print("Enter your choice (1-7): ");
                try {
                    choice = scanner.nextInt();
                    if (choice >= 1 && choice <= 7) {
                        break; // Valid choice, exit the validation loop.
                    } else {
                        System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                    }
                } catch (InputMismatchException e) {
                    // Handle non-integer inputs gracefully.
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); // Clear the invalid input.
                }
            }

            // If the user selects the exit option, break out of the main loop.
            if (choice == 7) {
                System.out.println("Thank you for using the Calculator App. Goodbye!");
                break;
            }

            double result = 0;
            // Process the choice using a switch-case to perform the desired operation.
            switch (choice) {
                case 1: // Addition
                    double addNum1 = readDouble(scanner, "Enter the first number: ");
                    double addNum2 = readDouble(scanner, "Enter the second number: ");
                    result = calculator.add(addNum1, addNum2);
                    System.out.printf("Result: %.2f\n", result);
                    System.out.println("Addition completed.");
                    break;
                case 2: // Subtraction
                    double subNum1 = readDouble(scanner, "Enter the first number: ");
                    double subNum2 = readDouble(scanner, "Enter the second number: ");
                    result = calculator.subtract(subNum1, subNum2);
                    System.out.printf("Result: %.2f\n", result);
                    System.out.println("Subtraction completed.");
                    break;
                case 3: // Multiplication
                    double mulNum1 = readDouble(scanner, "Enter the first number: ");
                    double mulNum2 = readDouble(scanner, "Enter the second number: ");
                    result = calculator.multiply(mulNum1, mulNum2);
                    System.out.printf("Result: %.2f\n", result);
                    System.out.println("Multiplication completed.");
                    break;
                case 4: // Division
                    double divNum1 = readDouble(scanner, "Enter the numerator: ");
                    double divNum2 = readDouble(scanner, "Enter the denominator: ");
                    if (divNum2 == 0) {
                        System.out.println("Error: Division by zero is undefined.");
                    } else {
                        result = calculator.divide(divNum1, divNum2);
                        System.out.printf("Result: %.2f\n", result);
                        System.out.println("Division completed.");
                    }
                    break;
                case 5: // Power (a^b)
                    double base = readDouble(scanner, "Enter the base number: ");
                    double exponent = readDouble(scanner, "Enter the exponent: ");
                    result = calculator.power(base, exponent);
                    System.out.printf("Result: %.2f\n", result);
                    System.out.println("Exponentiation completed.");
                    break;
                case 6: // Square Root
                    double number = readDouble(scanner, "Enter a number: ");
                    result = calculator.squareRoot(number);
                    if (!Double.isNaN(result)) {
                        System.out.printf("Result: %.2f\n", result);
                        System.out.println("Square root calculation completed.");
                    }
                    break;
                default:
                    // This default case is unlikely due to prior input validation.
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            // Ask the user if they want to perform another calculation.
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = scanner.next();
            // If the response is not "yes" (ignoring case), exit the loop.
            if (!response.equalsIgnoreCase("yes")) {
                continueCalculating = false;
                System.out.println("Thank you for using the Calculator App. Goodbye!");
            }
        }

        // Close the scanner resource to avoid resource leaks.
        scanner.close();
    }

    /**
     * Utility method to safely read a double value from the scanner with error handling.
     *
     * @param scanner the Scanner object for user input.
     * @param prompt  the message prompting the user.
     * @return a valid double value entered by the user.
     */
    private static double readDouble(Scanner scanner, String prompt) {
        double number = 0;
        while (true) {
            System.out.print(prompt);
            try {
                number = scanner.nextDouble();
                break; // Valid number entered; exit the loop.
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input.
            }
        }
        return number;
    }
}

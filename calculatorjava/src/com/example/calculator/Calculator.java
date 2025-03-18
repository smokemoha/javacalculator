// File: Calculator.java
// Package declaration for grouping related classes.
package com.example.calculator;

/**
 * A simple Calculator class that provides basic arithmetic operations.
 * This class includes methods for addition, subtraction, multiplication, division,
 * exponentiation, and square root calculation.
 */
public class Calculator {

    /**
     * Adds two numbers and returns the result.
     *
     * @param a the first number.
     * @param b the second number.
     * @return the sum of a and b.
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first and returns the result.
     *
     * @param a the first number.
     * @param b the second number.
     * @return the difference between a and b.
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers and returns the result.
     *
     * @param a the first number.
     * @param b the second number.
     * @return the product of a and b.
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides the first number by the second and returns the result.
     * If the denominator is zero, an error message is printed and NaN is returned.
     *
     * @param a the numerator.
     * @param b the denominator.
     * @return the quotient of a divided by b or Double.NaN if b is zero.
     */
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is undefined.");
            return Double.NaN;
        }
        return a / b;
    }

    /**
     * Raises a number to the power of another.
     *
     * @param a the base number.
     * @param b the exponent.
     * @return the result of a raised to the power of b.
     */
    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    /**
     * Calculates the square root of a number.
     * If the number is negative, an error message is printed and NaN is returned.
     *
     * @param a the number whose square root is to be calculated.
     * @return the square root of a or Double.NaN if a is negative.
     */
    public double squareRoot(double a) {
        if (a < 0) {
            System.out.println("Error: Cannot calculate the square root of a negative number.");
            return Double.NaN;
        }
        return Math.sqrt(a);
    }
}

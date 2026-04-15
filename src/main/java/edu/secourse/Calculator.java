package edu.secourse;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double sqrt(double i) {
        return Math.sqrt(i);
    }

    public static double divide(double a, double b) {
        if (b == 0.0) {
            throw new RuntimeException("Cannot divide by zero");
        }
        return a / b;
    }
}
package com.example;

public class BasicCalculator {
    private static int add(int a, int b) {
        return (a + b);
    }

    private static double substract(int a, int b) {
        return (a - b);
    }

    private static long multiply(int a, int b) {
        return (a * b);
    }

    private static double divide(int a, int b) {
        return (a / b);
    }

    public static void basicArithmeticOperations(int a, int b) {
        // ADD
        add(a, b);

        // SUBSTRACT
        substract(a, b);

        // MULTIPLICATION
        multiply(a, b);

        // DIVISION
        divide(a, b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 34;
        basicArithmeticOperations(a, b);
    }
}
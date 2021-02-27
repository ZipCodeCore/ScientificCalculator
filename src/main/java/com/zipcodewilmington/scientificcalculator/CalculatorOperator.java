package com.zipcodewilmington.scientificcalculator;

public class CalculatorOperator {

    public static double addition (double a, double b) {
        double addition = a + b;
        return addition;
    }

    public static double subtraction
            (double a, double b) {
        double subtraction = a - b;
        return subtraction;
    }

    public static double multiplication (double a, double b) {
        double multiplication = a * b;
        return multiplication;
    }

    public static double division (double a, double b) {
        double division = a / b;
        return division;
    }

    public static int square (int a) {
        int square = (int) Math.pow(a,2);
        return square;
    }

    public static double squareRoot (int a) {
        int squareRoot = (int) Math.sqrt(a);
        return squareRoot;
    }

    public static int exponents (int a, int b) {
        int exponent = (int) Math.pow(a,b);
        return exponent;
    }

    public static double multiplicativeInverse (double a) {
        double multiplicativeInverse = 1/a;
        return multiplicativeInverse;
    }

    public static int additiveInverse (int a) {
        int additiveInverse = a * -1;
        return additiveInverse;
    }

}


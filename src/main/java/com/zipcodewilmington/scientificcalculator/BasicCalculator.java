package com.zipcodewilmington.scientificcalculator;

public class BasicCalculator {

    private double result;

    public BasicCalculator(){
        result = 0.0;
    }

    public double add(double num1, double num2){
        result = num1 + num2;
        return result;
    }

    public double subtract(double num1, double num2){
        result = num1 - num2;
        return result;
    }

    public double multiply(double num1, double num2){
        result = num1 * num2;
        return result;
    }

    public double divide(double num1, double num2){
        result = num1 / num2;
        return result;
    }

    public double squareRoot(double num1) {
        result = Math.sqrt(num1);
        return result;
    }

    public double square(double num1) {
        result = Math.pow(num1, 2);
        return result;
    }

    public double exponentiation(double num1, double num2) {
        result = Math.pow(num1, num2);
        return result;
    }

    public double inverse(double num1) {
        result = 1 / num1;
        return result;
    }

    public double invertNumber(double num1) {
        result = -1 * num1;
        return result;
    }

    public double percentage(double num1) {
        result = num1 / 100;
        return result;
    }
}

package com.zipcodewilmington.scientificcalculator;

public class BasicCalculator {

    private Double result;

    public BasicCalculator(){
        result = 0.0;
    }

    public Double add(double num1, double num2){
        result = num1 + num2;
        return result;
    }

    public Double subtract(double num1, double num2){
        result = num1 - num2;
        return result;
    }

    public Double multiply(double num1, double num2){
        result = num1 * num2;
        return result;
    }

    public Double divide(double num1, double num2){
        result = num1 / num2;
        return result;
    }

    public Double squareRoot(Double num1) {
        result = Math.sqrt(num1);
        return result;
    }

    public Double square(Double num1) {
        result = Math.pow(num1, 2);
        return result;
    }

    public Double exponentiation(Double num1, Double num2) {
        result = Math.pow(num1, num2);
        return result;
    }

    public Double inverse(Double num1) {
        result = 1 / num1;
        return result;
    }

    public Double invertNumber(Double num1) {
        result = -1 * num1;
        return result;
    }

    public Double percentage(Double num1) {
        result = num1 / 100;
        return result;
    }
}

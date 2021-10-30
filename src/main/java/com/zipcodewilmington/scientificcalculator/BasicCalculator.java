package com.zipcodewilmington.scientificcalculator;

public class BasicCalculator {

    Double currentValue;

    public BasicCalculator(){
        currentValue = 0.0;
    }

    public Double add(double num1, double num2){
        currentValue = num1 + num2;
        return currentValue ;
    }

    public Double subtract(double num1, double num2){
        currentValue = num1 - num2;
        return currentValue ;
    }

    public Double multiply(double num1, double num2){
        currentValue = num1 * num2;
        return currentValue ;
    }

    public Double divide(double num1, double num2){
        currentValue = num1 / num2;
        return currentValue ;
    }

    public Double squareRoot(Double num1) {
        currentValue = Math.sqrt(num1);
        return currentValue ;
    }

    public Double square(Double num1) {
        currentValue = Math.pow(num1, 2);
        return currentValue ;
    }

    public Double exponentiation(Double num1, Double num2) {
        currentValue = Math.pow(num1, num2);
        return currentValue;
    }

    public Double inverse(Double num1) {
        currentValue = 1 / num1;
        return currentValue;
    }

    public Double invertNumber(Double num1) {
        currentValue = -1 * num1;
        return currentValue;
    }

    public Double percentage(Double num1) {
        currentValue = num1 / 100;
        return currentValue;
    }
}

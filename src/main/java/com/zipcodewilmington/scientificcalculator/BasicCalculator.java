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

    public Double divide(double num1, double num2){
        result = num1 / num2;
        return result;
    }

    public Double multiply(double num1, double num2){
        result = num1 * num2;
        return result;
    }

}

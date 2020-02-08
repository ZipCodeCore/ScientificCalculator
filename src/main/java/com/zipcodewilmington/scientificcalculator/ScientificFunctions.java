package com.zipcodewilmington.scientificcalculator;

public class ScientificFunctions {

    public boolean IsANumber(Double input) {
        return true;
    }

    /*public class convertToDouble {
        private String number1;
        double convertedNumber = Double.parseDouble(number1);
    }*/
    public Double Add(Double a, Double b) {
        Double sum = a + b;
        return sum;
    }

    public Double Subtract(Double a, Double b) {
        Double sum = a - b;
        return sum;
    }

    public Double Multiply(Double a, Double b) {
        Double sum = a * b;
        return sum;
    }

    public Double Divide(Double a, Double b) {
        Double sum = a / b;
        return sum;
    }

    public Double SquareRoot(Double a) {
        Double sum = Math.sqrt(a);
        return sum;
    }

    public Double Square(Double a, Double b) {
        Double sum = a - b;
        return sum;
    }

    public Double Inverse() {
        return null;
    }

    public void Clear() {

    }


    // returns sine
    public double sine(double input){
        double number = input;
        return Math.sin(number);
    }
    // returns cosine
    public double cosine(double input){
        double number = input;
        return Math.cos(number);
    }
    // returns tangent
    public double tangent(double input){
        double number = input;
        return Math.tan(number);
    }
    // inverse sine
    public double inverseSine(double input){
        double number = input;
        return Math.asin(number);
    }
    // inverse cosine
    public double inverseCosine(double input){
        double number = input;
        return Math.acos(number);
    }
    // inverse tangent
    public double inverseTangent(double input){
        double number = input;
        return Math.atan(number);
    }

    // to radians

    public double radianCalc(double input){
        double number = input;
        return Math.toRadians(number);
    }

    // to degrees
    public double degreesCalc(double input){
        double number = input;
        return Math.toDegrees(number);
    }

    // calc log
    public double calcLog(double input){
        double number = input;
        return Math.log(number);
    }

}

package com.zipcodewilmington.scientificcalculator;

//CLASS
public class Calculator {

    // CONSTRUCTOR
    public Calculator(){

    }

    //METHODS know also as a FUNCTION's
    public double add(double a, double b){
        return a + b;
    }

    public double subtract(double a, double b){
        return a - b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public double divide(double a, double b){
        return a / b;
    }

    public double modulo(double a, double b){
        return a % b;
    }

    public double square(double a){
        return a * a;
    }

    public double squareRoot(double a){
        if (a < 0){
            return Double.NaN;
        }
        return Math.sqrt(a);
    }

    public double varExpnt(double a, double b){
        return Math.pow(a, b);
    }

    public double inverse(double a){
        if (a == 0.0){
            return Double.NaN; //System.out.println("You cannot inverse 0");
        }
        return 1.0 / a;
    }

    public double invertSign(double a) {
        double result;

        if (a >= 0) {
            result = -a; // If number is non-negative, invert its sign
        } else {
            result = Math.abs(a); // If number is negative, return its positive equivalent
        }
        return result;
    }

    public double calcSine(double value) {
        double sineValue = Math.sin(value);
        return sineValue;
    }

    public double calcCosine(double value) {
        double cosineValue = Math.cos(value);
        return cosineValue;
    }

    public double calcTangent(double value) {
        double tangentValue = Math.tan(value);
        return tangentValue;
    }

    public double inverseSine(double value) {
        double inverseSineValue = Math.asin(value);
        return inverseSineValue;
    }

    public double inverseCosine(double value) {
        double inverseCosineValue = Math.acos(value);
        return inverseCosineValue;
    }

    public double inverseTangent(double value) {
        double inverseTangentValue = Math.atan(value);
        return inverseTangentValue;
    }


    // MAIN METHOD
    public static void main(String[] args) {
        //have to use 'new' to make the object and name of the constructor
        Calculator myCalculator = new Calculator();
        //myCalculator.add(); <-- name of the variable + method add
        // now we use the name of the var that holds the reference to that variable
        System.out.println(myCalculator.add(5.2,7.1));
        // in the print line we have the name of the variable + our method called add
        System.out.println(myCalculator.subtract(45.1,11.2));
        System.out.println(myCalculator.square(22));
        System.out.println(myCalculator.squareRoot(8));
        System.out.println(myCalculator.varExpnt(7,3));
        System.out.println(myCalculator.inverse(5));
        System.out.println(myCalculator.invertSign(-333));
        System.out.println(myCalculator.calcSine(45));
        System.out.println(myCalculator.calcCosine(45));
        System.out.println(myCalculator.calcTangent(45));
        System.out.println(myCalculator.inverseSine(.77));
        System.out.println(myCalculator.inverseCosine(.77));
        System.out.println(myCalculator.inverseTangent(45));





    }


}
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



    }


}
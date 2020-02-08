package com.zipcodewilmington.scientificcalculator;

public class Basic{
    public double add(double a, double b){
        double sum = a+b;
        return sum;
    }
    public double subtract(double a, double b){
        double difference = a-b;
        return difference;

    }
    public double multiply(double a, double b){
        double product = a*b;
        return product;
    }

    public double divide(double a, double b){
        double quotient = a/b;
        return quotient;
    }

    public double square(double a){
        double squareResult = (double) Math.pow(a,2);
        return squareResult;

    }
    public double squareRoot(double a){
        double squareRootResult = (double) Math.sqrt(a);
        return squareRootResult;
    }
    public double exponent(double a, double b){
        double exponentResult = (double) Math.pow(a,b);
        return exponentResult;
    }
    public double inverse(double a){
        double inverseResult = 1/a;
        return inverseResult;
    }
    public double signChange(double a){
        double opposite = 0;
        if (a > 0){
            opposite = a - (2 * Math.abs(a));
        } else if(a < 0){
            opposite = a + (2 * Math.abs(a));
        } else {
            opposite = 0;
        }

        return opposite;
    }
}
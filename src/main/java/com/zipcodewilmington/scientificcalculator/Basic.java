package com.zipcodewilmington.scientificcalculator;

public class Basic{
    public static double add(double a, double b){
        double sum = a+b;
        return sum;
    }
    public static double subtract(double a, double b){
        double difference = a-b;
        return difference;

    }
    public static double multiply(double a, double b){
        double product = a*b;
        return product;
    }

    public static double divide(double a, double b){
        double quotient = a/b;
        return quotient;
    }

    public static double square(double a){
        double squareResult = (double) Math.pow(a,2);
        return squareResult;

    }
    public static double squareRoot(double a){
        double squareRootResult = (double) Math.sqrt(a);
        return squareRootResult;
    }
    public static double exponent(double a, double b){
        double exponentResult = (double) Math.pow(a,b);
        return exponentResult;
    }
    public static double inverse(double a){
        double inverseResult = 1/a;
        return inverseResult;
    }
    public static double signChange(double a){
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
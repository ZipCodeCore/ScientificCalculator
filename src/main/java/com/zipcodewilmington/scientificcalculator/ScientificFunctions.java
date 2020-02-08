package com.zipcodewilmington.scientificcalculator;

public class ScientificFunctions {

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

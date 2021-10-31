package com.zipcodewilmington.scientificcalculator;

public class ScFunction {

    private Double result;

    // 1 for degree & 2 for radian
    private int unitsMode;

    public ScFunction() {
        result = 0.0; // constructor to initialize variable
        unitsMode = 1;
    }

    public double sin(double num1) {
        result = Math.sin(num1);
        result = applyUnitMode(result);
        return result;
        // this works
    }

    public double cosine(double num1) {
        result = Math.cos(num1);
        result = applyUnitMode(result);
        return result;
        // this works
    }


    public double tangent(double num1) {
        result = Math.tan(num1);
        result = applyUnitMode(result);
        return result;
        // this works
    }


    public double inverseSin(double num1) {
        result = Math.asin(num1);
        result = applyUnitMode(result);
        return result;
        // this works
        // num1 NEEDS TO BE BETWEEN -1 AND 1 otherwise NaN.
    }


    public double inverseCosine(double num1) {
        result = Math.acos(num1);
        result = applyUnitMode(result);
        return result;
        // this works
        // num1 NEEDS TO BE BETWEEN -1 AND 1 otherwise NaN
    }


    public double inverseTangent(double num1) {
        result = Math.atan(num1);
        result = applyUnitMode(result);
        return result;
        // this works
        // no input restrictions
    }


    public double log(double num1) {
        result = Math.log(num1);
        return result;
        // need to revisit--not sure
    }


    public double inverseLog(double num1) {
        result = Math.exp(Math.pow(10, num1));
        return result;
        // inputs are traditionally known as x and y
        // needs two inputs
    }

    public double inverseNaturalLog(double num1) {
        result = Math.pow(Math.E, num1);
        return result;

    }

    public double changesign(double num1) {
        // Implement change sign
        return num1;
    }

    public double rad(double num1){
        result = Math.toRadians(num1);
        return result;
    }

    public double degree(double num1){
        result = Math.toDegrees(num1);
        return result;
    }

    //Fibonacci has own class


    //Factorial
    public Double factorial(Double num1) {
        if (num1 == 0)
            return 1.00;
        else
            return (num1 * factorial(num1 - 1));
    }

    public Double applyUnitMode(Double result) {

        if (unitsMode == 2) {
            result = Math.toRadians(result);
        }
        return result;
    }

    public void switchUnitMode() {

        if (unitsMode == 1) {
            unitsMode = 2;
            Console.println("Switched Unit Mode from Degree to Radian");
        } else {
            unitsMode = 1;
            Console.println("Switched Unit Mode from Radian to Degree");
        }
    }

    public void setUnitMode(int givenUnitMode) {

        unitsMode = givenUnitMode;
    }

    public String getUnitMode() {
        if (unitsMode == 1) {
            return "Degree";
        } else {
            return "Radian";
        }
    }
}



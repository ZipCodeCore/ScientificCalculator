package com.zipcodewilmington.scientificcalculator;

import java.util.Arrays;

public class Core {
    private Double firstVal;
    private Double secondVal;
    private static Double result;

    public Core() {}
//    public Core(double firstVal, double secondVal, double result) {
//        firstVal = 0;
//        secondVal = 0;
//        result = 0;
//    }

    public static double add (double firstVal, double secondVal) {
        result = firstVal + secondVal;
        return result;
    }
    public double substract (double firstVal, double secondVal) {
        result = firstVal - secondVal;
        return result;
    }
    public double multiply (double firstVal, double secondVal) {
        result = firstVal * secondVal;
        return result;
    }
    public double divide (double firstVal, double secondVal) {
        if (secondVal == 0) {
            return 0;
        }
        else {
            result = firstVal / secondVal;
            return result;
        }
    }
    public double square (double firstVal) {
        result = firstVal*firstVal;
        return result;

    }
    public double squareRoot (double firstVal) {
        result = Math.sqrt(firstVal);
        return result;
    }
    public double exponent (double firstVal, double secondVal) {
        result =  Math.pow(firstVal, secondVal);
        return result;
    }
    public double inverse (double firstVal) {
        if (firstVal == 0) {
            return 0;
        }
        else {
            result = (1 / firstVal);
            return result;
        }
    }
    public double invertSign (double firstVal) {

        if (firstVal == 0) {
            return 0;
        }
        else {
            result = -firstVal;
            return result;
        }
    }
    public int clear() {
        return 0;
    }

    public static Integer validOperator (String inputTest) {

        String [] oneSidedOp = {"M+","MC","MRC","sin","cos","tan","asin","acos","atan","log","ln","e^x","10^x","!","clear","sq","sqrt","inv","sign"};
        String [] twoSidedOp = {"+","-","*","/","exp","switchDR","switchDISP"};

        for (String operator : oneSidedOp) {
            if (inputTest.equals(operator)) {
                return 1;
            }
        }
        for (String operator : twoSidedOp) {
            if (inputTest.equals(operator)) {
                return 2;
            }
        }
        return 0;
    }
}

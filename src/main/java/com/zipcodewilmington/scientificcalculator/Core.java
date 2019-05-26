package com.zipcodewilmington.scientificcalculator;

import java.util.Arrays;

public class Core extends Extended{
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
    public static double substract (double firstVal, double secondVal) {
        result = firstVal - secondVal;
        return result;
    }
    public static double multiply (double firstVal, double secondVal) {
        result = firstVal * secondVal;
        return result;
    }
    public static double divide (double firstVal, double secondVal) {
        if (secondVal == 0) {
            return 0;
        }
        else {
            result = firstVal / secondVal;
            return result;
        }
    }
    public static double square (double firstVal) {
        result = firstVal*firstVal;
        return result;

    }
    public static double squareRoot (double firstVal) {
        result = Math.sqrt(firstVal);
        return result;
    }
    public static double exponent (double firstVal, double secondVal) {
        result =  Math.pow(firstVal, secondVal);
        return result;
    }
    public static double inverse (double firstVal) {
        if (firstVal == 0) {
            return 0;
        }
        else {
            result = (1 / firstVal);
            return result;
        }
    }
    public static double invertSign (double firstVal) {

        if (firstVal == 0) {
            return 0;
        }
        else {
            result = -firstVal;
            return result;
        }
    }
    public static double clear() {
        return 0.0;
    }

    public static Integer validOperator (String inputTest) {

        String [] oneSidedOp = {"M+","MC","MRC","sin","cos","tan","asin","acos","atan","log","ln","e^x","10^x","!","c","sq","sqrt","inv","sign"};
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

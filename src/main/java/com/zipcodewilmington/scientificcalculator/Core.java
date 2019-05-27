package com.zipcodewilmington.scientificcalculator;

import java.util.Arrays;

public class Core {

    private String display;
    private double curNum;

    public Core() {
        display = "0";
        curNum = 0;
    }
//    public Core(double firstVal, double secondVal, double result) {
//        firstVal = 0;
//        secondVal = 0;
//        result = 0;
//    }

    public static double add(double firstVal, double secondVal) {
        return firstVal + secondVal;
    }

    public static double subtract(double firstVal, double secondVal) {
        return firstVal - secondVal;
    }

    public static double multiply(double firstVal, double secondVal) {
        return firstVal * secondVal;
    }

    public static double divide(double firstVal, double secondVal) {
        if (secondVal == 0)
            return Double.NaN;
        else
            return firstVal / secondVal;
    }

    public static double square(double firstVal) {
        return firstVal * firstVal;
    }

    public static double squareRoot(double firstVal) {
        return Math.sqrt(firstVal);
    }

    public static double exponent(double firstVal, double secondVal) {
        return Math.pow(firstVal, secondVal);
    }

    public static double inverse(double firstVal) {
        if (firstVal == 0)
            return Double.NaN;
        else
            return (1 / firstVal);
    }

    public static double invertSign(double firstVal) {
        if (firstVal == 0)
            return 0;
        else
            return -firstVal;
    }

    public void clear() {
        setDisplay("0");
        setCurNum(0);
    }

    public void setCurNum(double newNum) {
        curNum = newNum;
    }

    public double getCurNum() {
        return curNum;
    }

    public void setDisplay(String input) {
        display = input;
    }

    public void addToDisplay(String input) {
        display += input;
    }

    public void setDisplayErr(String message) {
        display = "Err: " + message;
    }

    public String getDisplay() {
        return display;
    }
}


package com.zipcodewilmington.scientificcalculator;


public class CoreCalc {
    public double basicCalcs (double d, double d2, String s){

        Double result= 0.0;
        switch (s) {
            case "+": result = d + d2;
                break;
            case "-": result = d - d2;
                break;
            case "*": result = d * d2;
                break;
            case "/": result = d / d2;
                break;
        }
        return result;
    }
    public double advancedCalcs (String s,Double d, Double d2) {

        Double result = 0.0;
        switch (s) {
            case "exponentiation":
                result = Math.pow(d, d2);
                break;

        }
        return result;
    }

    public double advancedCalcs2 (String s,Double d){

        Double result = 0.0;
        switch (s) {
            case "square root": result = Math.sqrt(d);
                break;
            case "square": result = Math.pow(d, 2);
                break;
            case "invert": result =  -d;
                break;
            case "reciprocal": result = 1.0/d;
        }
        return result;
    }
}
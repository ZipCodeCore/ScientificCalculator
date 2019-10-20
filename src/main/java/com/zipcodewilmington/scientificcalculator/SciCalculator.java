package com.zipcodewilmington.scientificcalculator;

public class SciCalculator {
    public static String sine(double x){
        return String.valueOf(Math.sin(x));
    }
    public static String cosine(double x){
        return String.valueOf(Math.cos(x));
    }
    public static String tangent(double x){
        return String.valueOf(Math.tan(x));
    }
    public static String csc(double x){
        return String.valueOf(Math.asin(x));
    }
    public static String sec(double x){
        return String.valueOf(Math.acos(x));
    }
    public static String cotan(double x){
        return String.valueOf(Math.atan(x));
    }

}

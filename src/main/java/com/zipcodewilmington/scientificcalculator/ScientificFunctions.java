package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;
public class ScientificFunctions {
    public static double sin(double a) {
        double b = Math.toRadians(a);
        return(Math.sin(b));
    }
    public static double cos(double a) {
        a = Math.toRadians(a);
        return(Math.cos(a));
    }
    public static double tan(double a) {
        double b = Math.toRadians(a);
        return(Math.tan(b));
    }
    public static double asin(double a) {
        a = Math.PI;
        return(Math.asin(a));
    }
    public static double acos(double a) {
        a = Math.PI / 2;
        a = Math.toRadians(a);
        return(Math.acos(a));
    }
    public static double atan(double a) {
        a = Math.PI;
        return(Math.atan(a));
    }
    public static double toDegrees(double rad) {
        return(Math.toDegrees(rad));
    }
    public static double factorial(double n) {
        int res = 1, i;
        for(i =2; i<=n; i++)
            res *=i;
        return res;
    }
}
package io.github.aaronclong.calculator;

/**
 * Created by aaronlong on 4/30/17.
 */
public class TrigFunctions {
    public static double process(String type, double x) {
        double value = 0.0;
        if (type.equals("sin")) value = Math.sin(x);
        else if (type.equals("cos")) value = Math.cos(x);
        else if (type.equals("tan")) value = Math.tan(x);
        else if (type.equals("in-sin")) value = Math.asin(x);
        else if (type.equals("in-tan")) value = Math.atan(x);
        else if (type.equals("in-cos")) value = Math.acos(x);
        return value;
    }
}

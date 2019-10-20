package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;

public class Inversion {
    public static Double changeSign (Double a)
    {
        return a = a * (-1);
    }

    public static Double inverseNum (Double a)
    {
        ErrorMessages.noInverseZero(a);
        return a = 1 / a;
    }
}

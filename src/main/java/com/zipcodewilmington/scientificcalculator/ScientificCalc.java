package com.zipcodewilmington.scientificcalculator;

import static java.lang.Math.*;

public class ScientificCalc {

    // Trig Functions

    // Sine
    public double sin (double num1) {
        return sin( num1 );
    }

    // Cosine
    public double cos (double num1) {
        return cos( num1 );
    }

    // Tangent
    public double tan (double num1) {
        return tan( num1 );
    }

    // Inverse Sine
    public double inverseSin (double num1) {
        return asin( num1 );
    }

    // Inverse Cosine
    public double  inverseCos(double num1) {
        return acos( num1 );
    }

    // Inverse Tangent
    public double inverseTan (double num1) {
        return atan( num1 );
    }

    // Logarithmic Functions

    // Log
    public double logarithm (double num1) {
        return log10(num1);
    }

    // Inverse Logarithm
    public double inverseLog (double num1) {
        return exp(num1);
    }

    // Natural Log
    public double naturalLog (double num1) {
        return log(num1);
    }

    // Inverse Natural Log
    public double inverseNaturalLog (double num1) {
        return Math.pow(10, num1);
    }

    // Factorial
    public int factorial (int num1) {
        int sum = 1;
        for (int i = 2; i <= num1  ; i++) {
            sum *= i;
        }
        return sum;
    }

    // Degrees to Radians

    public Double radian(Double num1){
        return toRadians(num1);
    }

    // Radians to Degrees
    public Double degree(Double num1){
        return toDegrees(num1);
    }


}

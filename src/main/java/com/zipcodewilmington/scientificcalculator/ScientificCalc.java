package com.zipcodewilmington.scientificcalculator;

public class ScientificCalc {

    // Trig Functions

    // Sine
    public double sin (double num1) {
        return Math.sin( num1 );
    }

    // Cosine
    public double cos (double num1) {
        return Math.cos( num1 );
    }

    // Tangent
    public double tan (double num1) {
        return Math.tan( num1 );
    }

    // Inverse Sine
    public double inverseSin (double num1) {
        return Math.asin( num1 );
    }

    // Inverse Cosine
    public double  inverseCos(double num1) {
        return Math.acos( num1 );
    }

    // Inverse Tangent
    public double inverseTan (double num1) {
        return Math.atan( num1 );
    }

    // Logarithmic Functions

    // Log
    public double log (double num1) {
        return Math.log10(num1);
    }

    // Inverse Logarithm
    public double inverseLog (double num1) {
        return Math.exp(num1);
    }

    // Natural Log
    public double naturalLog (double num1) {
        return Math.log(num1);
    }

    // Inverse Natural Log
    /* public double inverseNaturalLog (double num1) {
        return Math.pow(10, num1);
    }
    */

    // Factorial
    public int factorial (int num1) {
        int sum = 1;
        for (int i = 2; i <= num1  ; i++) {
            sum *= i;
        }
        return sum;
    }

}

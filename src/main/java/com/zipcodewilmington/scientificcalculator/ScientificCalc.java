package com.zipcodewilmington.scientificcalculator;

import static java.lang.Math.*;

public class ScientificCalc {

    // Trig Functions

    // Sine
    public double sine (double num1) {
        return sin( num1 );
    }

    // Cosine
    public double cose (double num1) {
        return cos( num1 );
    }

    // Tangent
    public double tangent (double num1) {
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
        return pow(10,num1);
    }

    // Natural Log
    public double naturalLog (double num1) {
        return log(num1);
    }

    // Inverse Natural Log
    public double inverseNaturalLog (double num1) {
        return exp(num1);
    }

    // Factorial
    public double factorial (double num1) {

        int intNum1 = (int) Math.round(num1);
        double sum = 1.0;
        for (int i = 2; i <= intNum1  ; i++) {
            sum *= i;
        }
        return sum;
    }

    // Monthly Interest Calc
    public double yearlyInterest (double principal, double interestRate) {
        double amount = principal * (1 + (interestRate/100)) - principal;
        return amount;
    }

    // First input is take in a principal amount and then the rate is a percentage

    // IsPrime
    public boolean isPrime(double num) {
        if (num <= 1) {
            return false;
        }
        for (double i = 2; i <= sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Degrees to Radians
    public Double radian(Double num1){
        return toRadians(num1);
    }

    // Radians to Degrees
    public Double degree(Double num1){
        return toDegrees(num1);
    }

    // Ghetto Switch Display Mode
    public static String Hexadecimal(Integer input) {
        return Integer.toHexString(input);
    }
    public static String Octal(Integer input) {
        return Integer.toOctalString(input);
    }
    public static String Binary(Integer input) {
        return Integer.toBinaryString(input);
    }

}

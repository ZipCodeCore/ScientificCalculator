package com.zipcodewilmington.scientificcalculator;

public class Calculator {

    public String mode = "dec";



    public double add(double var1, double var2) {
        return var1 + var2;
    }

    public double subtract(double var1, double var2) {
        return var1 - var2;
    }

    public double multiply(double var1, double var2) {
        return var1 * var2;
    }

    public double divide(double var1, double var2) {
        return var1 / var2;
    }

    public double square(double var1) {
        return var1 * var1;
    }

    public double squareRoot(double var1) {
        return Math.sqrt(var1);
    }

    public double exponent(double var1, double var2) {
        return Math.pow(var1, var2);
    }

    public double inverse(double var1) {
        return (1 / var1);
    }

    public double signSwitch(double var1) {
        return (var1 * -1);
    }

    public double sin(double var1) {
        return (Math.sin(var1));
    }

    public double cos(double var1) {
        return (Math.cos(var1));
    }

    public double tangent(double var1) {
        return (Math.tan(var1));

    }

    public double InverseSin(double var1) {
        return (Math.asin(var1));
    }

    public double InverseCos(double var1) {
        return (Math.acos(var1));
    }

    public double InverseTangent(double var1) {
        return (Math.atan(var1));
    }

    public double log(double var1) {
        return (Math.log(var1));
    }

    public double log10X(double var1) {
        return (Math.log10(var1));
    }

    public double tenToThe(double var1) {
        return (Math.pow(10,var1));
    }

    public double Ex(double var1) {
        return (Math.exp(var1));
    }

    public double Ln(double var1) {
        return (-Math.log(1 - var1) / var1);
    }

    public double factorial(double var1) {
        double factorial = 1;
        for (int i = 2; i <= var1; i++) {
            factorial = factorial * i;
        }
        return factorial;

    }

    public int DecimalToOther(int var1, int radix){
        Integer.toString(var1, radix);
        return var1;
    }

    public int BinToDec( int var1 ){
        return var1;
    }
    public int OctToDec( int var1 ){
        return var1;
    }
    public int HexToODec( int var1 ){
        return var1;
    }

}


package com.anthony.calculator;

import org.apache.commons.math3.util.ArithmeticUtils;

/**
 * Created by anthonyjones on 4/28/17.
 */
public class BasicMath {


    public double add(double number1, double number2) {

        return number1 + number2;
    }

    public double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public double divide(double number1, double number2) {
        if (number2 == 0) {
            return Double.NaN;
        }

        return number1 / number2;
    }

    public double calcSqrRoot(double number1) {
        return Math.sqrt(number1);
    }

    public double calcSquared(double number1) {
        return Math.pow(number1, 2);
    }

    public double calcFactorial(double number1) {
        int factorialCastToInt = (int) number1;
        return ArithmeticUtils.factorialDouble(factorialCastToInt);
    }

    public double calcVariableExponent(double number1, double number2) {

        return Math.pow(number1, number2);
    }

    public double calcTemperatureInCelsius(double number1) {
        return (number1 - 32) * .5556;
    }

    public double calcTemperatureInFahrenheit(double number1) {
        return 1.8 * number1 + 32;
    }

    public double invertSign(double number1) {
        return number1 * -1;
    }

    public double inverseNumber(double number1) {
        return Math.pow(number1, -1);
    }

    public double calcLog(double number1) {
        return Math.log10(number1);
    }

    public double calcNaturalLog(double number1) {
        return Math.log(number1);
    }

    public double calcInverseLog(double number1) {

        return Math.pow(10, number1);
    }

    public double calcInverseNaturalLog(double number1) {
        return Math.exp(number1);
    }


}

package com.anthony.calculator;
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


}

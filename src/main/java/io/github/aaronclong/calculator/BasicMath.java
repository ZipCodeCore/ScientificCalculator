package io.github.aaronclong.calculator;

/**
 * Created by aaronlong on 4/29/17.
 */
public class BasicMath {

    public static double addition(double x, double y) {
        return x + y;
    }

    public static double division(double x, double y) {
        if (x == 0 || y == 0) return Double.NaN;
        return x/y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double findOperation(String symbol, double x, double y) {
        double value;
        switch (symbol.charAt(0)) {
            case '+':
                value = addition(x, y);
                break;
            case '-':
                value = subtract(x, y);
                break;
            case '*':
                value = multiply(x, y);
                break;
            case '/':
                value = division(x, y);
                break;
            default:
                value = Double.NaN;
        }
        return value;
    }
}

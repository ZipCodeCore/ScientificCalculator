package mccann.kevin.calculator;

import java.util.ArrayList;
import java.util.Arrays;

import static mccann.kevin.calculator.Display.*;

/**
 * Created by kevinmccann on 1/13/17.
 */
public class Calculator {
    public static ArrayList<String> commandList = new ArrayList<String>(Arrays.asList("ADD",
            "SUBTRACT", "MULTIPLY", "DIVIDE", "POWER", "SQUARE", "SQUAREROOT",
            "INVERSE", "SINE", "COSINE", "TANGENT", "INVERSESIN", "INVERSECOS", "INVERSETAN",
            "LOG", "INVERSELOG", "LN", "INVERSELN", "FACTORIAL");


    public double evaluateTwo(String command, double firstValue, double currentValue) {
        int index = commandList.indexOf(command);

        switch (index) {
            case 0:
                return add(firstValue, currentValue);
                break;
            case 1:
                return subtract(firstValue, currentValue);
                break;
            case 2:
                return multiply(firstValue, currentValue);
                break;
            case 3:
                return divide(firstValue, currentValue);
                break;
            case 4:
                return power(firstValue, currentValue);
                break;
            default:
                return -1;
        }
    }

    public double evaluate(String command, double firstValue) {
        int index = commandList.indexOf(command);

        switch (index) {
            case 5:
                return square(firstValue);
                break;
            case 6:
                return squareroot(firstValue);
                break;
            case 7:
                return inverse(firstValue);
                break;
            case 8:
                return sin(firstValue);
                break;
            case 9:
                return cos(firstValue);
                break;
            case 10:
                return tan(firstValue);
                break;
            case 11:
                return sininverse(firstValue);
                break;
            case 12:
                return cosinverse(firstValue);
                break;
            case 13:
                return taninverse(firstValue);
                break;
            case 14:
                return log(firstValue);
                break;
            case 15:
                return inverselog(firstValue);
                break;
            case 16:
                return ln(firstValue);
                break;
            case 17:
                return inversenaturallog(firstValue);
                break;
            case 18:
                return factorial(firstValue);
                break;
            default:
                return 0;
        }
    }

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        if(y == 0)

        return x / y;
    }

    public double square(double x) {
        return x * x;
    }

    public double squareroot(double x) {
        return Math.sqrt(x);
    }

    public double power(double x, double y) {
        return Math.pow(x, y);
    }

    public double inverse(double x) {
        return divide(1, x);
    }

    public double sin(double x) {
        return Math.sin(x);
    }

    public double cos(double x) {
        return Math.cos(x);
    }

    public double tan(double x) {
        return Math.tan(x);
    }

    public double sininverse(double x) {
        return divide(1,sin(x));
    }

    public double cosinverse(double x) {
        return divide(1,cos(x));
    }

    public double taninverse(double x) {
        return divide(1,tan(x));
    }

    public double log(double x) {
        return Math.log10(x);
    }

    public double ln(double x) {
        return Math.log(x);
    }

    public double inverselog(double x) {
        return divide(1,log(x));
    }

    public double inversenaturallog(double x) {
        return divide(1,ln(x));
    }

    public double factorial(double x) {
        int total = 1;
        for (int i = 1; i <= x; i++) {
             total *= i;
        }
        return total;
    }
}

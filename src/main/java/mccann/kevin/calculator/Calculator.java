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
            "LOG", "INVERSELOG", "LN", "INVERSELN", "FACTORIAL", "M+", "MC", "MRC"));
    Display display = new Display();


    public double evaluateTwo(String command, double firstValue, double currentValue) {
        int index = commandList.indexOf(command);

        switch (index) {
            case 0:
                return add(firstValue, currentValue);
            case 1:
                return subtract(firstValue, currentValue);
            case 2:
                return multiply(firstValue, currentValue);
            case 3:
                return divide(firstValue, currentValue);
            case 4:
                return power(firstValue, currentValue);
            default:
                return -1;
        }
    }

    public double evaluate(String command, double firstValue) {
        int index = commandList.indexOf(command);

        switch (index) {
            case 5:
                return square(firstValue);
            case 6:
                return squareroot(firstValue);
            case 7:
                return inverse(firstValue);
            case 8:
                return sin(firstValue);
            case 9:
                return cos(firstValue);
            case 10:
                return tan(firstValue);
            case 11:
                return sininverse(firstValue);
            case 12:
                return cosinverse(firstValue);
            case 13:
                return taninverse(firstValue);
            case 14:
                return log(firstValue);
            case 15:
                return inverselog(firstValue);
            case 16:
                return ln(firstValue);
            case 17:
                return inversenaturallog(firstValue);
            case 18:
                return factorial(firstValue);
            case 19:
                return addToMemory(firstValue);
            case 20:
                return clearMemory();
            case 21:
                return recallMemory();
            default:
                return -1;
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
        if(y == 0) {
            display.notError = false;
            display.errorDisplay();
        }
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

    private double addToMemory(double x){
        display.setMemory(display.getMemory() + x);
        return display.getMemory() + x;
    }

    private double clearMemory(){
        display.setMemory(0);
        return 0;
    }

    private double recallMemory(){
        display.display(Double.toString(display.getMemory()));
        return display.getMemory();
    }
}

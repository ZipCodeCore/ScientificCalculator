package com.brownmark;
import java.lang.Math;

public class CalculationFeed {


    public CalculationFeed() {}


    BasicAlgebraEngine basicAlgebraEngine = new BasicAlgebraEngine();


    public boolean checkForMatchingUnaryOperator(String operator) {
        if (operator.equals("^2")) {return true;}
        else if (operator.equals("1/")) {return true;}
        else if (operator.equals("-")) {return true;}
        else if (operator.equals("sqrt")) {return true;}
        else {return false;}
    }


    public boolean errorChecks (double operandOne, String operator) {
        if (operator.equals("1/") && operandOne == 0) {return true;}
        else if (operator.equals("sqrt") && operandOne < 0) {return true;}
        else {return false;}
    }


    public boolean errorChecks (double operandOne, String operator, double operandTwo) {
        if (operator.equals("/") && operandTwo == 0) {return true;}
        else {return false;}
    }


    public double sendInputsThroughFeed (double operandOne, String operator) {
        if (operator.equals("^2")) {return basicAlgebraEngine.square(operandOne);}
        else if (operator.equals("1/")) {return basicAlgebraEngine.reciprocal(operandOne);}
        else if (operator.equals("-")) {return basicAlgebraEngine.multiply(operandOne, -1);}
        else if (operator.equals("sqrt")) {return basicAlgebraEngine.squareRoot(operandOne);}
        else {return Double.NaN;}
    }


    public double sendInputsThroughFeed (double operandOne, String operator, double operandTwo) {
        if (operator.equals("+")) {return basicAlgebraEngine.add(operandOne, operandTwo);}
        else if (operator.equals("-")) {return basicAlgebraEngine.subtract(operandOne, operandTwo);}
        else if (operator.equals("-")) {return basicAlgebraEngine.multiply(operandOne, operandTwo);}
        else if (operator.equals("/")) {return basicAlgebraEngine.divide(operandOne, operandTwo);}
        else {return Double.NaN;}
    }


}

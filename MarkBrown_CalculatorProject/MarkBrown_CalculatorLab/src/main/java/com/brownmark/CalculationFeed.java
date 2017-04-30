package com.brownmark;
import java.lang.Math;

public class CalculationFeed {



    public CalculationFeed() {}



    BasicAlgebraEngine basicAlgebraEngine = new BasicAlgebraEngine();
    LogarithmFunctionEngine logarithmFunctionEngine = new LogarithmFunctionEngine();
    BasicTrigFunctionEngine basicTrigFunctionEngine = new BasicTrigFunctionEngine();



    public boolean checkForMatchingUnaryOperator(String operator) {
        if (operator.equals("^2")) {return true;}
        else if (operator.equals("1/")) {return true;}
        else if (operator.equalsIgnoreCase("neg")) {return true;}
        else if (operator.equalsIgnoreCase("sqrt")) {return true;}
        else if (operator.equalsIgnoreCase("log")) {return true;}
        else if (operator.equals("10^")) {return true;}
        else if (operator.equalsIgnoreCase("ln")) {return true;}
        else if (operator.equals("e^")) {return true;}
        else {return false;}
    }



    public boolean checkForMatchingTrigOperator(String operator) {
        if (operator.equalsIgnoreCase("sin")) {return true;}
        else if (operator.equalsIgnoreCase("cos")) {return true;}
        else if (operator.equalsIgnoreCase("tan")) {return true;}
        else {return false;}
    }



    public boolean errorChecks (double operandOne, String operator) {
        if (operator.equals("1/") && operandOne == 0) {return true;}
        else if (operator.equalsIgnoreCase("sqrt") && operandOne < 0) {return true;}
        else if (operator.equalsIgnoreCase("log") && operandOne <= 0) {return true;}
        else if (operator.equalsIgnoreCase("ln") && operandOne <= 0) {return true;}
        else {return false;}
    }



    public boolean degreeTrigErrorChecks (double operandOne, String operator) {
        if (operator.equalsIgnoreCase("tan") && (Math.toRadians(operandOne) == (Math.PI / 2))) {return true;}
        else if (operator.equalsIgnoreCase("tan") && (Math.toRadians(operandOne) == ((3 * Math.PI) / 2))) {return true;}
        else {return false;}
    }




    public boolean radianTrigErrorChecks (double operandOne, String operator) {
        if (operator.equalsIgnoreCase("tan") && (operandOne == (Math.PI / 2))) {return true;}
        else if (operator.equalsIgnoreCase("tan") && (operandOne == ((3 * Math.PI) / 2))) {return true;}
        else {return false;}}




    public boolean errorChecks (double operandOne, String operator, double operandTwo) {
        if (operator.equals("/") && operandTwo == 0) {return true;}
        else {return false;}
    }




    public double sendInputsThroughFeed (double operandOne, String operator) {
        if (operator.equals("^2")) {return basicAlgebraEngine.square(operandOne);}
        else if (operator.equals("1/")) {return basicAlgebraEngine.reciprocal(operandOne);}
        else if (operator.equalsIgnoreCase("neg")) {return basicAlgebraEngine.multiply(operandOne, -1);}
        else if (operator.equalsIgnoreCase("sqrt")) {return basicAlgebraEngine.squareRoot(operandOne);}
        else if (operator.equalsIgnoreCase("log")) {return logarithmFunctionEngine.logFunction(operandOne);}
        else if (operator.equals("10^")) {return logarithmFunctionEngine.inverseLogFunction(operandOne);}
        else if (operator.equalsIgnoreCase("ln")) {return logarithmFunctionEngine.naturalLogFunction(operandOne);}
        else if (operator.equals("e^")) {return logarithmFunctionEngine.inverseNaturalLogFunction(operandOne);}
        else if (operator.equalsIgnoreCase("sin")) {return basicTrigFunctionEngine.sineFunction(operandOne);}
        else if (operator.equalsIgnoreCase("cos")) {return basicTrigFunctionEngine.cosineFunction(operandOne);}
        else if (operator.equalsIgnoreCase("tan")) {return basicTrigFunctionEngine.tanFunction(operandOne);}

        else {return Double.NaN;}

    }



    public double sendInputsThroughFeed (double operandOne, String operator, double operandTwo) {
        if (operator.equals("+")) {return basicAlgebraEngine.add(operandOne, operandTwo);}
        else if (operator.equals("-")) {return basicAlgebraEngine.subtract(operandOne, operandTwo);}
        else if (operator.equals("*")) {return basicAlgebraEngine.multiply(operandOne, operandTwo);}
        else if (operator.equals("/")) {return basicAlgebraEngine.divide(operandOne, operandTwo);}
        else if (operator.equals("^")) {return basicAlgebraEngine.exponential(operandOne, operandTwo);}
        else {return Double.NaN;}
    }



}

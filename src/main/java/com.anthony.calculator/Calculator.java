package com.anthony.calculator;

/**
 * Created by anthonyjones on 4/28/17.
 */
public class Calculator {

    BasicMath basicMath = new BasicMath();
    double number1;
    double number2;
    double result;

    public void setNumber1(double number1) {
        this.number1 = number1;
        //return number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
        // return number2;
    }


    public void doOperation(Operation assignmentFromEnum) {

        switch (assignmentFromEnum) {
            case ADD:
                result = basicMath.add(number1, number2);
                break;
            case SUBTRACT:
                result = basicMath.subtract(number1, number2);
                break;
            case MULTIPLY:
                result = basicMath.multiply(number1, number2);
                break;
            case DIVIDE:
                result = basicMath.divide(number1, number2);
                break;
            case SQUARE_ROOT:
                result = basicMath.calcSqrRoot(number1);
                break;
            default:

                break;

        }
    }

    public double getResult() {
        return result;
    }

}

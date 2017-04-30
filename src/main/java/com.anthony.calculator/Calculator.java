package com.anthony.calculator;

/**
 * Created by anthonyjones on 4/28/17.
 */
public class Calculator {

   private BasicMath basicMath = new BasicMath();
    private Memory holderOfMemory = new Memory();
    private double number1;
    private double number2;
    private double result;

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
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
            case CALCULATEVARIBLEEXP:
                result = basicMath.calcVariableExponent(number1, number2);
                break;
            case SQUARED:
                result = basicMath.calcSquared(number1);
                break;
            case FACTORIAL:
                result = basicMath.calcFactorial(number1);
                break;
            case FAHRENHEIT_TO_CELSIUS:
                result = basicMath.calcTemperatureInCelsius(number1);
                break;
            case CELSIUS_TO_FAHRENHEIT:
                result = basicMath.calcTemperatureInFahrenheit(number1);
                break;

            case INVERT_SIGN:
                result = basicMath.invertSign(number1);
                break;
            case INVERSE_NUMBER:
                result = basicMath.inverseNumber(number1);
                break;

            default:

                break;

        }
    }

    public void sendNumberToMemory(){
        holderOfMemory.addToMemory(number1);
    }



    public Double getResult() {

        return result;
    }

}

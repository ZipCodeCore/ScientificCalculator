package com.anthony.calculator;

/**
 * Created by anthonyjones on 4/28/17.
 */
public class Calculator {

    BasicMath basicMath = new BasicMath();
    double number1;
    double number2;


    public void doOperation(Operation assignmentFromEnum) {

        switch (assignmentFromEnum) {
            case ADD:
               basicMath.add(number1, number2);
            break;

            default:

            break;

        }
    }

}

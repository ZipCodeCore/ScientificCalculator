package com.zipcode.calculator;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Scanner;

/**
 * Created by vidyachandasekhar on 4/30/17.
 */
public class CalculatorInput {

    public void getUserInput() {
        Scanner input = new Scanner(System.in);
        Double firstNumber = getUserInputAndConvertToDouble(input);
        Calculator calculator = new Calculator();
        calculator.setValue(firstNumber);


        while (true) {
            System.out.println("Enter the operation (Clear | Add | Subtract | Multiply| Divide | Square|Sqrtroot ) ");

            String userOperation = input.next();

            switch (userOperation) {
                case "Clear":
                    clearValue(calculator, input);
                    break;
                case "Add":
                    callAdd(calculator, input);
                    break;
                case "Subtract":
                    callSubtract(calculator, input);
                    break;
                case "Multiply":
                    callMultiply(calculator, input);
                    break;
                case "Divide":
                    callDivide(calculator, input);
                    break;
                case "Square":
                    callComputeSquare(calculator);
                    break;
                case "Sqrtroot":
                    callComputeSquareRoot(calculator);
                    break;
                case "Exit":
                    return;

                default:
                    System.out.println("Invalid input (Valid inputs are Clear|Add|Subtract|Multiply|Divide|Square|Sqrtroot|Exit");
                    break;

            }
        }

    }

    private void clearValue(Calculator calculator, Scanner input) {
        calculator.setValue(0.00);
        System.out.println(calculator.getCurrentDisplay());
        Double userNumber = getUserInputAndConvertToDouble(input);
        calculator.setValue(userNumber);


    }

    private void callAdd(Calculator calculator, Scanner input) {
        Double number = getUserInputAndConvertToDouble(input);
        calculator.add(number);
        System.out.println(calculator.getCurrentDisplay());

    }

    private void callSubtract(Calculator calculator, Scanner input) {
        Double number = getUserInputAndConvertToDouble(input);
        calculator.subtract(number);
        System.out.println(calculator.getCurrentDisplay());
    }


    private void callMultiply(Calculator calculator, Scanner input) {
        Double number = getUserInputAndConvertToDouble(input);
        calculator.multiply(number);
        System.out.println(calculator.getCurrentDisplay());
    }

    private void callDivide(Calculator calculator, Scanner input) {
        Double number = getUserInputAndConvertToDouble(input);
        calculator.divide(number);
        System.out.println(calculator.getCurrentDisplay());

    }

    private void callComputeSquare(Calculator calculator) {
        calculator.computeSquare();
        System.out.println(calculator.getCurrentDisplay());
    }


    private void callComputeSquareRoot(Calculator calculator) {
        calculator.computeSquareRoot();
        System.out.println(calculator.getCurrentDisplay());

    }

    private Double getUserInputAndConvertToDouble(Scanner input) {
        System.out.println("Enter The Number");
        String firstInput = input.next();
        while (!NumberUtils.isNumber(firstInput)) {
            System.out.println("Invalid input : Please enter a valid numrber!");
            firstInput = input.next();
        }
        Double firstNumber = Double.parseDouble(firstInput);
        return firstNumber;
    }

}



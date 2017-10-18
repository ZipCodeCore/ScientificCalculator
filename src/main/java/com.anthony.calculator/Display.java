package com.anthony.calculator;

import java.util.Scanner;

/**
 * Created by anthonyjones on 4/28/17.
 */
public class Display {

    private String givenNumber;
    private String firstNumber;
    private String secondNumber;
    private String operationOfChoice;
    private int enumLoopCounter;
    private boolean ifOnlyOneNumber = false;
    private boolean isCalculatorRunning = true;
    private Operation operationOfEnum;
    Calculator calculator = new Calculator();
    private Scanner input = new Scanner(System.in);


    Display() {
        startingCalculatorDisplay();
        setCurrentNumber();
        setFirstNumber();
        displayChoices();
        continuouslyRunCalculator();
    }

    private void startingCalculatorDisplay() {
        System.out.println("Please enter your first number.");
        System.out.println("0");
    }

    private void displayChoices() {
        System.out.println("Please choose a number from the options below.");
        for (Operation enumLoop : operationOfEnum.values()) {
            enumLoopCounter++;
            System.out.print(enumLoop + " : " + enumLoopCounter + "  " + "|" + " ");
            if (enumLoopCounter % 4 == 0) {
                System.out.println();
            }
        }
        enumLoopCounter = 0;
        System.out.println();
    }

    private void operationChoice() {
       String choice = input.nextLine().replaceAll("\\s", "");
        this.operationOfChoice = choice.trim();
    }

    private void methodOfOperation() {

        switch (operationOfChoice) {

            case "q":
                isCalculatorRunning = false;
                continuouslyRunCalculator();
                break;

            case "r":
                clearDisplay();
                resetState();
                break;
            default:
                for (Operation enumLoop : operationOfEnum.values()) {
                    int enumPosition = Operation.valueOf(enumLoop.toString()).ordinal();
                    try {
                        if (enumPosition == Integer.parseInt(operationOfChoice) - 1) {
                            operationOfEnum = enumLoop;
                            if (enumPosition < 5) {
                                System.out.println("You've chosen to " + "'" +
                                        operationOfEnum + "'" +
                                        " Please enter another number.");
                            } else {
                                System.out.println("You've chosen " + operationOfEnum);
                                ifOnlyOneNumber = true;
                                break;
                            }
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("You did not enter a correct option, please try again");
                        operationChoice();
                    }
                }
                break;
        }
    }

    private void setCurrentNumber() {
       String numberToBeParsed = input.nextLine().trim();
        this.givenNumber = numberToBeParsed;
    }

    private void setFirstNumber() {
        String firstNumber = this.givenNumber;
        this.firstNumber = firstNumber;
    }

    private void setSecondNumber() {
        secondNumber = this.givenNumber;
        this.secondNumber = secondNumber.replaceAll("\\s", "");
    }

    private void calculateAndSendAllNumbers() {

        if (ifOnlyOneNumber) {
            calculator.setNumber1(Double.parseDouble(firstNumber));
        } else {
            calculator.setNumber1(Double.parseDouble(firstNumber));
            calculator.setNumber2(Double.parseDouble(secondNumber));
        }
        calculator.doOperation(operationOfEnum);
    }

    private void getCalculation() {
        if (calculator.getResult().isNaN()) {
            System.out.println("ERR");
            resetState();
        } else {
            System.out.println();
            System.out.println("The answer is " + calculator.getResult() + "\n" +
                    " \nEnter an operation if you would like to continue, 'q' to quit or 'r' if you would like to reset calculator");
            System.out.println();

        }
    }

    private void continuouslyRunCalculator() {
        while (isCalculatorRunning) {
            operationChoice();
            methodOfOperation();

            if (ifOnlyOneNumber) {
                calculateAndSendAllNumbers();
                getCalculation();
                ifOnlyOneNumber = false;
                memoryHolder();
                displayChoices();
                continuouslyRunCalculator();
            }

            setCurrentNumber();
            setSecondNumber();
            calculateAndSendAllNumbers();
            getCalculation();
            memoryHolder();
            displayChoices();
        }

        System.exit(0);
    }

    private void memoryHolder() {
        firstNumber = calculator.getResult().toString().trim();
    }

    private void clearDisplay() {
        for (int a = 0; a < 50; a++)
            System.out.println();
    }

    private void resetMemory() {
        firstNumber = "0";
    }

    private void resetState() {
        resetMemory();
        new Display();
    }


}

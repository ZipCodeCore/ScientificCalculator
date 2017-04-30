package com.anthony.calculator;

import java.util.Scanner;

/**
 * Created by anthonyjones on 4/28/17.
 */
public class Display {

    private String givenNumber;
    private String number1;
    private String number2;
    private String choice;
    private int enumLoopCounter;
    private int methodCounterForBoolean = 0;
    private boolean onlyOneCalculation = false;
    private boolean isRunning = false;
    private Operation operationOfEnum;
    Calculator calculator = new Calculator();
    private Scanner in = new Scanner(System.in);


    Display() {
        startingCalculatorDisplay();

        setCurrentNumber(givenNumber);
        setNumber1(number1);
        //chooseCorrectAmountOfNumbersToCalculate();
        continuousRun();


    }

    public void startingCalculatorDisplay() {
        System.out.println("Welcome to Anthony's simple, yet smart Calculator!");
        //System.out.println("Please enter the number of the operation you would like to perform.");
        System.out.println("0");
    }


    public void displayChoices() {
        for (Operation enumLoop : operationOfEnum.values()) {
            enumLoopCounter++;
            System.out.print(enumLoop + " : " + enumLoopCounter + "  " + "|" + " ");
        }
        enumLoopCounter = 0;
        System.out.println();
    }


    public String operationChoice(String choice) {
        choice = in.nextLine();
        this.choice = choice;
        return choice;
    }

    public void operationToSend() {
        for (Operation enumLoop : operationOfEnum.values()) {

            int enumPosition = Operation.valueOf(enumLoop.toString()).ordinal();
            try {

                if (enumPosition == Integer.parseInt(choice) - 1) {
                    operationOfEnum = enumLoop;
                    if (enumPosition < 4) {
                        System.out.println("You've chosen to " + operationOfEnum + " Enter another number");
                    } else {
                        System.out.println("You've chosen " + operationOfEnum);
                        onlyOneCalculation = true;


                        break;
                    }

                }

            } catch (NumberFormatException e) {
                System.out.println("You did not enter a correct option, please try again");
                operationChoice(choice);
            }

        }
    }

    public void chooseCorrectAmountOfNumbersToCalculate() {

        if (onlyOneCalculation == true) {
            setCurrentNumber(givenNumber);
            setNumber1(number1);
        } else {
            setCurrentNumber(givenNumber);
            setNumber1(number1);
            System.out.println("Please enter the second Number.");
            setCurrentNumber(givenNumber);
            setNumber2(number2);
        }
    }


    public void setCurrentNumber(String numberToBeParsed) {

        numberToBeParsed = in.nextLine();
        this.givenNumber = numberToBeParsed;

    }

    public void setNumber1(String number1) {

        number1 = this.givenNumber;
        this.number1 = number1;
        //System.out.println(number1);

    }

    public void setNumber2(String number2) {

        number2 = this.givenNumber;
        this.number2 = number2;
    }


    public void calculateAndSendAllNumbers() {

        if (onlyOneCalculation) {
            calculator.setNumber1(Double.parseDouble(number1));
        } else {
            calculator.setNumber1(Double.parseDouble(number1));
            calculator.setNumber2(Double.parseDouble(number2));
        }

        calculator.doOperation(operationOfEnum);
    }

    public void getCalculation() {
        if (calculator.getResult().isNaN()) {
            System.out.println("ERR");

        } else {
            System.out.println("The answer is " + calculator.getResult() + " Enter an operation if you would like to continue, or press q to quit");
            System.out.println();
        }
    }

    public void continuousRun() {

        while (!isRunning) {
            displayChoices();
            operationChoice(choice);
            operationToSend();

            if (onlyOneCalculation) {
                calculateAndSendAllNumbers();
                getCalculation();
                onlyOneCalculation = false;
                memoryHolder();
                continuousRun();
            }


            setCurrentNumber(givenNumber);
            setNumber2(number2);
            calculateAndSendAllNumbers();

            getCalculation();
            memoryHolder();

        }


    }

    public void memoryHolder() {
        // System.out.println(calculator.getResult() + " Ignore me");
        number1 = calculator.getResult().toString();
    }

    public void clearDisplay() {
    }


    public void switchDisplayMode() {

    }

    public void switchDisplayMode(String mode) {

    }

}

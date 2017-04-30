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
    private boolean onlyOneCalculation = false;
    private boolean isRunning = true;
    private Operation operationOfEnum;
    Calculator calculator = new Calculator();
    private Scanner in = new Scanner(System.in);


    Display() {
        startingCalculatorDisplay();
        setCurrentNumber(givenNumber);
        setNumber1(number1);
        displayChoices();
        continuousRun();


    }

    public void startingCalculatorDisplay() {
        System.out.println("Welcome to Anthony's simple, yet smart Calculator!");
        System.out.println("0");
    }


    public void displayChoices() {
        for (Operation enumLoop : operationOfEnum.values()) {
            enumLoopCounter++;
            System.out.print(enumLoop + " : " + enumLoopCounter + "  " + "|" + " ");
            if (enumLoopCounter == 6) {
                System.out.println();
            }
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
        if (choice.equals("q")) {
            isRunning = false;
            continuousRun();

        } else if (choice.equals("`")) {
            clearDisplay();
            resetMemory();

        } else {
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
            System.out.println("The answer is " + calculator.getResult() + "\n" +
                    "Enter an operation if you would like to continue, q to quit or ` if you would like to start anew");
            System.out.println();

        }
    }

    public void continuousRun() {

        while (isRunning) {

            operationChoice(choice);
            operationToSend();

            if (onlyOneCalculation) {
                calculateAndSendAllNumbers();
                getCalculation();
                onlyOneCalculation = false;
                memoryHolder();
                displayChoices();
                continuousRun();
            }

            setCurrentNumber(givenNumber);
            setNumber2(number2);
            calculateAndSendAllNumbers();
            getCalculation();
            memoryHolder();
            displayChoices();
        }

        System.exit(0);
    }

    public void memoryHolder() {
        // System.out.println(calculator.getResult() + " Ignore me");
        number1 = calculator.getResult().toString();
    }

    public void quitCalculator() {

        //  isRunning = false;
    }

    public void clearDisplay() {
        for (int a = 0; a < 50; a++)
            System.out.println();
    }

    public void resetMemory() {
        number1 = "0";
    }

    public void switchDisplayMode() {

    }

    public void switchDisplayMode(String mode) {

    }

}

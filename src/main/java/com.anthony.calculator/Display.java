package com.anthony.calculator;

import javax.naming.NameNotFoundException;
import java.util.Scanner;

/**
 * Created by anthonyjones on 4/28/17.
 */
public class Display {

    String givenNumber;
    String number1;
    String number2;
    String choice;
    Operation operationOfEnum;
    int enumLoopCounter;
    boolean onlyOneCalculation = false;
    Scanner in = new Scanner(System.in);
    Calculator calculator = new Calculator();


    Display() {
        startingCalculatorDisplay();
        loopThroughAndPrintEnums();
        operationChoice(choice);
        operationToSend();
        pickCorrectAmountOfNumbersToCalculate();
        calculateAndSendAllNumbers();
        getCalculation();
    }

    public void startingCalculatorDisplay() {
        System.out.println("Welcome to Anthony's simple yet, smart Calculator!");
        System.out.println("Please enter the number of the operation you would like to perform.");
    }

    public void loopThroughAndPrintEnums() {
        for (Operation enumLoop : operationOfEnum.values()) {
            enumLoopCounter++;
            System.out.println(enumLoop + ": " + enumLoopCounter);
        }
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
                        System.out.println("You've chosen to " + operationOfEnum +
                                " Please enter your first number for this equation");
                    } else {
                        System.out.println("You've chosen to " + operationOfEnum +
                                " Please enter your number for this equation");
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

    public void pickCorrectAmountOfNumbersToCalculate() {

        if (onlyOneCalculation == true) {
            setCurrentNumber(givenNumber);
            setNumber1(number1);
        } else {
            setCurrentNumber(givenNumber);
            setNumber1(number1);
            setCurrentNumber(givenNumber);
            setNumber2(number2);
        }
    }


    public String setCurrentNumber(String numberToBeParsed) {

        numberToBeParsed = in.nextLine();
        this.givenNumber = numberToBeParsed;
        return numberToBeParsed;
    }

    public void setNumber1(String number1) {

        number1 = this.givenNumber;
        this.number1 = number1;
        //System.out.println(number1);
        System.out.println("Please enter the second Number.");

    }

    public void setNumber2(String number2) {

        number2 = this.givenNumber;
        this.number2 = number2;
    }


    public void calculateAndSendAllNumbers() {

        if (onlyOneCalculation == true) {
            calculator.setNumber1(Integer.parseInt(number1));
        } else {
            calculator.setNumber1(Integer.parseInt(number1));
            calculator.setNumber2(Integer.parseInt(number2));
        }

        calculator.doOperation(operationOfEnum);
    }

    public void getCalculation() {
        System.out.println("The answer is " + calculator.getResult());
    }

    public void clearDisplay() {
    }


    public void switchDisplayMode() {

    }

    public void switchDisplayMode(String mode) {

    }

}

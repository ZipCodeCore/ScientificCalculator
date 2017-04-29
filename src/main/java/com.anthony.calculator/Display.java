package com.anthony.calculator;

import java.util.Scanner;

/**
 * Created by anthonyjones on 4/28/17.
 */
public class Display {

    String currentNumber;
    String givenNumber;
    String choice;
    Operation operationOfEnum;
    int enumCount;
    int enumLooopCounter;
    String enumOperation;
    Scanner in = new Scanner(System.in);
    Calculator calculator = new Calculator();
    double result;
    boolean calculatorRunning = true;


    Display() {
        startingCalculatorDisplay();
        loopThroughAndPrintEnums();
        operationChoice(choice);
        operationToSend();
        changeCurrentNumber(givenNumber);
        setNumber1();
        setNumber2();
        calculateAllNumbers();
    }

    public void startingCalculatorDisplay() {
        System.out.println("Welcome to Anthony's simple yet, smart Calculator!");
        System.out.println("Please enter the number of the operation you would like to perform.");
    }

    public void loopThroughAndPrintEnums() {
        for (Operation enumLoop : operationOfEnum.values()) {
            enumLooopCounter++;
            System.out.println(enumLoop + ": " + enumLooopCounter);
        }
    }


    public String operationChoice(String choice) {


        choice = in.nextLine();
        this.choice = choice;

        return choice;
    }

    public void operationToSend() {

        for (Operation enumLoop : operationOfEnum.values()) {
            enumCount++;
            System.out.println(enumCount);
            if (Integer.parseInt(choice) == enumCount) {
                operationOfEnum = enumLoop;
                System.out.println("You've chosen to " + operationOfEnum +
                        " Please enter your first or only number for this equation");
                break;
            } else {
                System.out.println("Pick from the list please");
                operationChoice(choice);
            }
        }
    }

    public void setNumber1(){
        calculator.setNumber1(Integer.parseInt(givenNumber));
    }

    public void setNumber2(){
        calculator.setNumber2(Integer.parseInt(givenNumber));
    }


    public void calculateAllNumbers(){
        calculator.doOperation(operationOfEnum);
    }

    public void clearDisplay() {
    }

    public String changeCurrentNumber(String number) {

        number = in.nextLine();
        return number;
    }

    public void switchDisplayMode() {

    }

    public void switchDisplayMode(String mode) {

    }

}

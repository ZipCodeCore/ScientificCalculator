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
    String  enumOperation;
    Scanner in = new Scanner(System.in);
    double result;
    boolean calculatorRunning = true;


    Display() {
        startingCalculatorDisplay();
        loopThroughAndPrintEnums();
        operationChoice();
        System.out.println(choice);
        operationToSend();
    }

    public void startingCalculatorDisplay() {
        System.out.println("Welcome to Anthony's simple yet, smart Calculator!");
        System.out.println("Please enter the number of the operation you would like to perform.");
    }

    public void loopThroughAndPrintEnums() {
        for (Operation enumLoop : operationOfEnum.values()) {
            enumCount++;
            System.out.println(enumLoop + ": " + enumCount);
        }
    }


    public String operationChoice() {


        choice = in.nextLine();
        choice= choice;

    }

    public void operationToSend() {

        System.out.println(Integer.getInteger(choice));

        for (Operation enumLoop : operationOfEnum.values()) {
            enumCount++;
            if(Integer.getInteger(choice) == enumCount){
                operationOfEnum = enumLoop;

                System.out.println(enumCount);
            }else{
                System.out.println("Pick from the list please");
                operationChoice();
            }
        }


    }


    public void clearDisplay() {
    }

    public void changeCurrentNumber(String number) {

    }

    public void switchDisplayMode() {

    }

    public void switchDisplayMode(String mode) {

    }

}

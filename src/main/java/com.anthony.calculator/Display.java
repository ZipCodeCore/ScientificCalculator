package com.anthony.calculator;

import java.util.Scanner;

/**
 * Created by anthonyjones on 4/28/17.
 */
public class Display {

    String currentNumber;
    String givenNumber;
    Operation assignmentFromEnum;
    int enumCount;
    Scanner in = new Scanner(System.in);
    double result;
    boolean calculatorRunning=true;

    public static void main(String[] args) {
        startingCalculatorDisplay();

    }

    public static void startingCalculatorDisplay() {
        System.out.println("Welcome to Anthony's simple yet, smart Calculator!");
        System.out.println("Please enter an option of which operation you would like to perform");

        System.out.println("0");
    }

    public void listOfEnumOperations(){
        for(Operation enumLoop:assignmentFromEnum.values()){
            System.out.println(enumLoop + ": "+ " ");

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

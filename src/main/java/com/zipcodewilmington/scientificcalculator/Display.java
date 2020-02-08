package com.zipcodewilmington.scientificcalculator;

public class Display {
    public boolean checkState = true;
    double currentNum;
    double nextNum;
    boolean error;

    public void displayValue(double input){

        if (checkState) {
            currentNum = 0;
            System.out.println(currentNum);
            checkState = false;
        } else {
            System.out.println(input);
        }
        currentNum = input;

    }

    public void displayCurrentValue() {
        System.out.println(currentNum);

    }

    public void clearDisplay() {
        checkState = true;
        displayValue(0);
        error = false;

    }
    public void changeNumberDisplay(double nextInput) {
        currentNum = nextInput;
        System.out.println(currentNum);
    }
    public void displayErr() {
        //if math calculations don't work, display 'Err')
        error = true;
        System.out.println("Err. Clear screen.");
    }

}

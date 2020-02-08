package com.zipcodewilmington.scientificcalculator;

public class Calculator {
    Double currentValue = 0.0;
    Double memory;
    Double currentDisplay;
    boolean appropriateInput;
    Double answer;

    public Calculator() {

    }

    public Double getCurrentValue() {
        return currentValue;
    }

    /*public Double convertToDouble() {
        String number1 = Double.parseDouble();
        return answer;
    }*/

    public boolean checkIfAppropriate(boolean isAppropriate) {
        if (appropriateInput) {
            return appropriateInput;
        } else {
            return appropriateInput = false;
        }
    }

    /*public getCurrentAnswer() {

    }*/

    public Double updateCurrentValue() {
        currentValue = answer;
        return currentValue;
    }

}
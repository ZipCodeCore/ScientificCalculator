package com.zipcode.calculator;

/**
 * Created by vidyachandasekhar on 4/29/17.
 */
public class Calculator {

    private Double currentDisplay;
    private String displayMode;
    private String trigMode;

    public Calculator() {
        currentDisplay = new Double(0);
    }

    public Double getCurrentDisplay() {
        return currentDisplay;
    }

    public Double changeDisplay(Double newValue) {
        currentDisplay = newValue;
        return newValue;
    }

    public Double add(Double number) {
        currentDisplay = currentDisplay + number;
        return currentDisplay;
    }

    public Double subtract(Double number) {
        currentDisplay = currentDisplay - number;
        return currentDisplay;

    }

    public Double multiply(Double number) {
        currentDisplay = currentDisplay * number;
        return currentDisplay;

    }

}


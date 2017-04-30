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

    public String getCurrentDisplay() {
      if (Double.isNaN(currentDisplay)) {
            return "ERR";
        }
        return currentDisplay.toString();
    }

    public Double setValue(Double newValue) {
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

    public Double divide(Double number) {
        if (number == 0.00) {
            currentDisplay = Double.NaN;
            return Double.NaN;
        }

        currentDisplay = currentDisplay / number;
        return currentDisplay;

    }


}


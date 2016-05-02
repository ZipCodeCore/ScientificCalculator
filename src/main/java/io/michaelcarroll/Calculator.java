package io.michaelcarroll;

public class Calculator {

    /**
     * Performs operations and functions of a scientific calculator
     * Includes addition, subtraction, multiplication, division, square root,
     * square, inverse of number, variable exponentiation of number,
     * clear display, invert sign of number on display, store a value in memory,
     * get a value stored in memory, reset value stored in memory,
     * calculate sine, calculate tangent, calculate cosine,
     * calculate inverse sine, calculate inverse tangent,
     * calculate inverse cosine, calculate logarithm, calculate the natural logarithm,
     * calculate the inverse natural logarithm, calculate the inverse logarithm,
     * and calculate factorial
     */

    private static double valueStoredInMemory;


    public double addValues(double valueOnDisplay, double valueEntered) {
        return valueOnDisplay + valueEntered;
    }


    public double subtractValues(double valueOnDisplay, double valueEntered) {
        return valueOnDisplay - valueEntered;
    }

    public double multiplyValues(double valueOnDisplay, double valueEntered) {
        return valueOnDisplay * valueEntered;
    }


    public double divideValues(double valueOnDisplay, double valueEntered) {
        return valueOnDisplay / valueEntered;
    }


    public double calculateSquareRootOfNumberOnDisplay(double valueOnDisplay) {
        return Math.sqrt(valueOnDisplay);
    }

    public double calculateTheSquareOfNumberOnDisplay(double valueOnDisplay) {
        return valueOnDisplay * valueOnDisplay;
    }

    public double calculateInverseOfNumberOnDisplay(double valueOnDisplay) {
        return 1 / valueOnDisplay;
    }

    public double calculateVariableExponentiation(double valueOnDisplay, double powerToEntered) {
        return Math.pow(valueOnDisplay, powerToEntered);
    }

    public double clearNumberOnDisplay() {
        return 0;
    }

    public double invertSignOfCurrentNumberOnDisplay(double valueOnDisplay) {
        return valueOnDisplay * -1;
    }


    public void storeAValueInMemory(double valueStoredInMemory) {
        valueStoredInMemory = valueStoredInMemory;
    }

    public double getValueStoredInMemory() {
        return valueStoredInMemory;
    }

    public void resetValueStoredInMemory() {
        valueStoredInMemory = 0;
    }

    public double calculateTheSineOfValueOnDisplay(double valueOnDisplay) {
        if (Display.currentUnit == Units.DEGREES) {
            double radian = Math.toRadians(valueOnDisplay);
            return Math.sin(radian);
        } else {
            return Math.sin(valueOnDisplay);
        }
    }

    public double calculateTheCosineOfValueOnDisplay(double valueOnDisplay) {
        if (Display.currentUnit == Units.DEGREES) {
            double radian = Math.toRadians(valueOnDisplay);
            return Math.cos(radian);
        } else {
            return Math.cos(valueOnDisplay);
        }
    }

    public double calculateTheTangentOfTheDisplayedValue(double valueOnDisplay) {
        if (Display.currentUnit == Units.DEGREES) {
            double radian = Math.toRadians(valueOnDisplay);
            return Math.tan(radian);
        } else {
            return Math.tan(valueOnDisplay);
        }
    }

    public double calculateInverseSineOfValueOnDisplay(double valueOnDisplay) {
        if (Display.currentUnit == Units.RADIANS) {
            return Math.asin(valueOnDisplay);
        } else {
            return Math.toDegrees(Math.asin(valueOnDisplay));
        }
    }

    public double calculateTheInverseCosineOfValueOnDisplay(double valueOnDisplay) {
        if (Display.currentUnit == Units.RADIANS) {
            return Math.acos(valueOnDisplay);
        }
        else{
            return Math.toDegrees(Math.acos(valueOnDisplay));
        }
    }

    public double calculateTheInverseTangentOfTheValueOnDisplay(double valueOnDisplay) {
        if (Display.currentUnit == Units.RADIANS) {
            return Math.atan(valueOnDisplay);
        } else {
            return Math.toDegrees(Math.atan(valueOnDisplay));
        }
    }

    public double calculateTheLogOfValueOnDisplay(double valueOnDisplay) {
        return Math.log10(valueOnDisplay);
    }

    public double calculateTheInverseLogOfValueOnDisplay(double valueOnDisplay) {
        return Math.pow(10, valueOnDisplay);
    }

    public double calculateTheNaturalLogarithmOfValueOnDisplay(double valueOnDisplay) {
        return Math.log(valueOnDisplay);
    }

    public double calculateInverseNaturalLogarithmOfValueOnDisplay(double valueOnDisplay) {
        return Math.pow(Math.E, valueOnDisplay);
    }

    public double calculateTheFactorialOfValueOnDisplay(double valueOnDisplay) {
        if (valueOnDisplay == 1) {
            return 1;
        } else {
            return calculateTheFactorialOfValueOnDisplay(valueOnDisplay - 1) * valueOnDisplay;
        }
    }


}



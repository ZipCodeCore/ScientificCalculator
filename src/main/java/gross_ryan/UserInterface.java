package gross_ryan;

import java.util.Arrays;

/**
 * Created by ryangross on 1/15/17.
 */
public class UserInterface {
    Converter aConverter;
    Arithmetic anArithmetic;
    Exponential anExponential;
    ErrorCheck anErrorCheck;
    Memory aMemory;
    Trig aTrig;
    String currentMode = "decimal";
    static String[] arrayOfModes = {"binary", "decimal", "hexadecimal", "octal"};


    public Double doArithmetic(String aCommand, double displayedNumber, double numberToDoArithmeticOn) {
        Double result = (double) 0;
        if (!anErrorCheck.hasError) {
            switch (aCommand) {
                case "+":
                    result = anArithmetic.addNumbers(displayedNumber, numberToDoArithmeticOn);
                    break;
                case "-":
                    result = anArithmetic.subtractNumbers(displayedNumber, numberToDoArithmeticOn);
                    break;
                case "*":
                    result = anArithmetic.multiplyNumbers(displayedNumber, numberToDoArithmeticOn);
                    break;
                case "/":
                    if (displayedNumber != 0) {
                        result = anArithmetic.divideNumbers(displayedNumber, numberToDoArithmeticOn);
                        break;
                    } else {
                        anErrorCheck.hasError = true;
                        System.out.println("ERROR: DIVISION BY ZERO");
                        break;
                    }
                case "^":
                    result = anArithmetic.toThePowerOf(displayedNumber, numberToDoArithmeticOn);
            }
        } else {
            System.out.println("ERROR");
            result = null;
            return result;
        }
        return result;
    }

    public Double exponentialFunction(String aCommand, double displayedNumber) {
        Double result = displayedNumber;
        if (!anErrorCheck.hasError) {
            switch (aCommand) {
                case "^2":
                    result = anExponential.squareNumber(displayedNumber);
                    break;
                case "√":
                    result = anExponential.squaredRoot(displayedNumber);
                    break;
                case "1/X":
                    result = anExponential.inverseOfNumber(displayedNumber);
                    break;
            }
        } else {
            System.out.println("ERROR");
            result = null;
            return result;
        }
        return result;
    }

    public Double trigFunction(String aCommand, double displayedNumber) {
        Double result = displayedNumber;
        if (!anErrorCheck.hasError) {
            switch (aCommand) {
                case "sin":
                    result = aTrig.displaySin(displayedNumber);
                    break;
                case "inverse-sin":
                    result = 1 / aTrig.displaySin(displayedNumber);
                    break;
                case "cos":
                    result = aTrig.displayCos(displayedNumber);
                    break;
                case "inverse-cos":
                    result = 1 / aTrig.displayCos(displayedNumber);
                    break;
                case "tan":
                    result = aTrig.displayTan(displayedNumber);
                    break;
                case "inverse-tan":
                    result = 1 / aTrig.displayTan(displayedNumber);
            }
        } else {
            System.out.println("ERROR");
            result = null;
            return result;
        }
        return result;
    }

    public Double memoryFunction(String aCommand, double displayedNumber) {
        Double updateDisplay = displayedNumber;
        if (!anErrorCheck.hasError) {
            switch(aCommand) {
                case "M+":
                    updateDisplay = aMemory.addMemory(displayedNumber);
                    break;
                case "MC":
                   aMemory.resetNumber();
                   break;
                case "M":
                   updateDisplay = aMemory.reCallMemory();
                    break;
            }
        } else {
            System.out.println("ERROR");
            updateDisplay = null;
        }
        return updateDisplay;
    }

    // Switches mode, updates display..
    public void setMode(String currentMode) {
        int arrayKey = Arrays.asList(arrayOfModes).indexOf(currentMode);
        if (arrayKey < 3) {
            currentMode = Arrays.asList(arrayOfModes).get(arrayKey + 1);
        } else {
            currentMode = "decimal";
        }
    }

    public double changeSign(double displayedNumber) {
       return displayedNumber * -1;
    }

}

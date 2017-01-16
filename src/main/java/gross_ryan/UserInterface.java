package gross_ryan;

import java.util.Arrays;

/**
 * Created by ryangross on 1/15/17.
 */
public class UserInterface {
    Arithmetic anArithmetic;
    Exponential anExponential;
    ErrorCheck anErrorCheck;
    Memory aMemory;
    Trig aTrig;
    Logarithmic aLog;
    Custom aCustom;

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
                    result = aTrig.inverseSin(displayedNumber);
                    break;
                case "cos":
                    result = aTrig.displayCos(displayedNumber);
                    break;
                case "inverse-cos":
                    result = aTrig.inverseCos(displayedNumber);
                    break;
                case "tan":
                    result = aTrig.displayTan(displayedNumber);
                    break;
                case "inverse-tan":
                    result = aTrig.inverseTan(displayedNumber);
                    break;
                case "!":
                    result = aTrig.factorial(displayedNumber);
                    break;
            }
        } else {
            System.out.println("ERROR");
            result = null;
        }
        return result;
    }

    public Double logFunction(String aCommand, double displayedNumber) {
        Double result = displayedNumber;
        if (!anErrorCheck.hasError) {
            switch(aCommand) {
                case "log":
                    result = aLog.baseTenLog(displayedNumber);
                    break;
                case "10^x":
                    result = aLog.inverseBaseTenLog(displayedNumber);
                    break;
                case "ln":
                    result = aLog.naturalLog(displayedNumber);
                    break;
                case "e^x":
                    result = aLog.inverseNaturalLog(displayedNumber);
                    break;
            }
        } else {
            System.out.println("ERROR");
            result = null;
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

    public double customFunction(String aCommand, double displayedNumber) {
        Double updateDisplay = displayedNumber;
        if (!anErrorCheck.hasError) {
            switch(aCommand) {
                case "sum!":
                    aCustom.customSum(displayedNumber);
                    break;
                case "odd/even":
                    aCustom.oddOrEven(displayedNumber);
                    break;
            }
        } else {
            System.out.println("ERROR");
            updateDisplay = null;
        }
        return updateDisplay;
    }

    // Change Mode
    // Update the Display
    public void setMode(Display aDisplay) {
        int arrayKey = Arrays.asList(arrayOfModes).indexOf(aDisplay.displayMode);
        if (arrayKey < 3) {
            aDisplay.displayMode = Arrays.asList(arrayOfModes).get(arrayKey + 1);
        } else {
         aDisplay.displayMode = "decimal";
        }
        aDisplay.convertDisplayedNumberString(aDisplay.displayedNumber);
    }

    public void setMode(Display aDisplay, String selectedMode) {
        aDisplay.displayMode = selectedMode;
        aDisplay.setEntireDisplay(aDisplay.displayedNumber);
    }

    public void setTrigMode(Trig aTrig) {
        if (aTrig.trigMode.equals("degrees")) {
            aTrig.trigMode = "radians";
        } else {
            aTrig.trigMode = "degrees";
        }
    }

    public double changeSign(double displayedNumber) {
       return displayedNumber * -1;
    }
}

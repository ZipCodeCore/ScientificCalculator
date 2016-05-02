package io.brianabbott;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by brianabbott on 4/29/16.
 */

public class Display {

    private double newValue = 0;
    private double baseValue = 0;
    private String operator = "";
    private double memory;
    private boolean errorStatus = false;
    private boolean calculatorOn = true;
    public DisplayTypes displayMode = DisplayTypes.DECIMAL;

    Scanner input = new Scanner(System.in);
    Calculator calculate = new Calculator();

    /**
     * Getters and setters for private values
     */
    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getNewValue() {
        return newValue;
    }

    public void setNewValue(double newValue) {
        this.newValue = newValue;
    }

    public double getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(double baseValue) {
        this.baseValue = baseValue;
    }

    /**
     * Method to loop through program and display user input
     */
    public void runCalculator() {
        while (calculatorOn) {
            updateDisplay(implementDisplayMode(baseValue));
            takeInput();
        }
    }

    /**
     * Takes input using Scanner and calls method based on submission
     */
    public void takeInput() {
        if (input.hasNextDouble()) {
            baseValue = input.nextDouble();
            skipLines();
        } else if (input.hasNext()) {
            operator = input.nextLine();
            skipLines();
            switch (operator) {
                case "+":
                    updateDisplay(implementDisplayMode(baseValue));
                    newValue = input.nextDouble();
                    baseValue = calculate.sum(baseValue, newValue);
                    skipLines();
                    break;
                case "-":
                    updateDisplay(implementDisplayMode(baseValue));
                    newValue = input.nextDouble();
                    baseValue = calculate.subtract(baseValue, newValue);
                    skipLines();
                    break;
                case "*":
                case "x":
                    updateDisplay(implementDisplayMode(baseValue));
                    newValue = input.nextDouble();
                    baseValue = calculate.multiply(baseValue, newValue);
                    skipLines();
                    break;
                case "divide":
                case "Divide":
                case "/":
                    updateDisplay(implementDisplayMode(baseValue));
                    newValue = input.nextDouble();
                    if (newValue == 0) {
                        errorStatus = true;
                        break;
                    }
                    baseValue = calculate.divide(baseValue, newValue);
                    skipLines();
                    break;
                case "^2":
                case "squared":
                case "Square":
                case "square":
                    baseValue = calculate.square(baseValue);
                    skipLines();
                    break;
                case "^":
                case "exponent":
                    updateDisplay(implementDisplayMode(baseValue));
                    newValue = input.nextDouble();
                    baseValue = calculate.exponent(baseValue, newValue);
                    skipLines();
                    break;
                case "square root":
                case "root":
                case "Square root":
                case "Square Root":
                    baseValue = calculate.squareRoot(baseValue);
                    skipLines();
                    break;
                case "inverse":
                case "Inverse":
                case "1/x":
                    baseValue = calculate.inverse(baseValue);
                    skipLines();
                    break;
                case "+/-":
                case "-/+":
                    baseValue = calculate.invertSign(baseValue);
                    skipLines();
                    break;
                case "sin":
                case "sine":
                case "Sin":
                case "Sine":
                    baseValue = calculate.sine(baseValue);
                    skipLines();
                    break;
                case "cos":
                case "cosine":
                case "Cos":
                case "Cosine":
                    baseValue = calculate.cosine(baseValue);
                    skipLines();
                    break;
                case "tan":
                case "tangent":
                case "Tan":
                case "Tangent":
                    baseValue = calculate.tangent(baseValue);
                    skipLines();
                    break;
                case "asin":
                case "arcsin":
                case "Asin":
                case "Arcsin":
                    baseValue = calculate.inverseSine(baseValue);
                    skipLines();
                    break;
                case "acos":
                case "acosine":
                case "Acos":
                case "Acosine":
                    baseValue = calculate.inverseCosine(baseValue);
                    skipLines();
                    break;
                case "atan":
                case "atangent":
                case "Atan":
                case "Atangent":
                    baseValue = calculate.inverseTangent(baseValue);
                    skipLines();
                    break;
                case "factorial":
                case "Factorial":
                case "x!":
                case "X!":
                    baseValue = calculate.factorial(baseValue);
                    skipLines();
                    break;
                case "log":
                case "Log":
                    baseValue = calculate.log(baseValue);
                    skipLines();
                    break;
                case "nlog":
                case "ln":
                    baseValue = calculate.naturalLog(baseValue);
                    skipLines();
                    break;
                case "inverse log":
                case "10^x":
                    baseValue = calculate.inverseLog(baseValue);
                    skipLines();
                    break;
                case "e^x":
                case "inverse nLog":
                    baseValue = calculate.inverseNaturalLog(baseValue);
                    skipLines();
                    break;
                case "M+":
                case "m+":
                    storeMemory();
                    skipLines();
                    break;
                case "MC":
                case "mc":
                    resetMemory();
                    skipLines();
                    break;
                case "MRC":
                case "mrc":
                    recallMemory();
                    skipLines();
                    break;
                case "Mode":
                case "MODE":
                case "mode":
                    updateDisplayMode();
                    updateDisplay(implementDisplayMode(baseValue));
                    skipLines();
                    break;
                case "Hexadecimal":
                case "HEXADECIMAL":
                case "hexadecimal":
                    updateDisplayMode(DisplayTypes.HEXADECIMAL);
                    updateDisplay(implementDisplayMode(baseValue));
                    skipLines();
                    break;
                case "BINARY":
                case "binary":
                case "Binary":
                    updateDisplayMode(DisplayTypes.BINARY);
                    updateDisplay(implementDisplayMode(baseValue));
                    skipLines();
                    break;
                case "OCTAL":
                case "octal":
                case "Octal":
                    updateDisplayMode(DisplayTypes.OCTAL);
                    updateDisplay(implementDisplayMode(baseValue));
                    skipLines();
                    break;
                case "RAD":
                case "Radians":
                case "radians":
                case "rad":
                    calculate.switchUnitsMode(MathTerms.RADIANS);
                    updateDisplay(implementDisplayMode(baseValue));
                    skipLines();
                    break;
                case "DEG":
                case "Degrees":
                case "degrees":
                case "deg":
                    calculate.switchUnitsMode(MathTerms.DEGREES);
                    updateDisplay(implementDisplayMode(baseValue));
                    skipLines();
                    break;
                case "xPI":
                case "xpi":
                case "xPi":
                case "PI":
                    baseValue = calculate.timesPi(baseValue);
                    updateDisplay(implementDisplayMode(baseValue));
                    skipLines();
                    break;
                case "Units":
                case "units":
                case "unit":
                    calculate.switchUnitsMode();
                    updateDisplay(implementDisplayMode(baseValue));
                    skipLines();
                    break;
                case "clear":
                case "CE":
                case "ce":
                    clearDisplay();
                    updateDisplay(implementDisplayMode(baseValue));
                    skipLines();
                    break;
                case "Exit":
                case "EXIT":
                case "quit":
                case "Quit":
                case "exit":
                    updateDisplay(implementDisplayMode(baseValue));
                    calculatorOn = false;
                    System.out.println("Thank you for calculating!");
                    break;
                case "Upgrade":
                case "Upgrade now":
                case "upgrade":
                    updateDisplay(implementDisplayMode(baseValue));
                    calculatorOn = false;
                    System.out.println("Thank you for calculating!");
                    calculate.openUpgrade();
                    break;
                default:
                    System.out.println("ERROR - Command not found, please retry below");
                    break;
            }
        }
    }

    /**
     * Updates display with the base value and any operators entered.
     *
     * @param currentVal current used for basevalue, but could eventually display others
     */
    public void updateDisplay(String currentVal) {
        if (calculatorOn == true && errorStatus == false) {
            System.out.println("Calculator: Please enter one key per line");
            System.out.println("                   " + currentVal + "               ");
            System.out.println("-----------------------------------------------\n");
            System.out.println("| -  |  | -  | | *  | | /  | | ^2 |    | Clear|\n");
            System.out.println("|sin |  |cos | |tan | |^x  | |root|    | M+   |\n");
            System.out.println("|asin|  |acos| |atan| | x! | | +/-|    | MRC  |\n");
            System.out.println("|Rad |  |Deg | |tan | |asin| |acos|    | MC   |\n");
            System.out.println("|Unit|  |Mode| |xPI | |log | |10^x|    |      |\n");
            System.out.println("|    |  |    | |    | |ln  | |e^x |    | Exit |\n");
            System.out.println("Type Upgrade to upgrade now for 5.99!!!!\n");

        } else {
            System.out.println("ERROR - Please Clear to continue");
        }
        switch (operator) {
            case "":
                System.out.println("Current operation (none)   Current Mode: " + displayMode);
                System.out.println("Current units " + calculate.unitsMode + "     Memory Stored:" + memory);
                break;
            default:
                System.out.println("Current operation (" + operator + ")   Current Mode: " + displayMode);
                System.out.println("Current units " + calculate.unitsMode + "     Memory Stored:" + memory);
                break;
        }
    }

    /**
     * Stores the current display value as a memory
     */
    public void storeMemory() {
        memory = baseValue;
    }

    /**
     * Sets the stored memory back to zero
     */
    public void resetMemory() {
        memory = 0;
    }

    /**
     * Uses the stored memory to set the display value
     */
    public void recallMemory() {
        baseValue = memory;
    }

    /**
     * Sets the display value back to zero, removes any error status, and resets display/unit modes
     */
    public void clearDisplay() {
        baseValue = 0;
        errorStatus = false;
        updateDisplayMode(DisplayTypes.DECIMAL);
        calculate.switchUnitsMode(MathTerms.RADIANS);
    }

    /**
     * Uses newlines to simulate screen refresh
     */
    public void skipLines() {
        for (int i = 0; i < 50; i++) {
            System.out.println("\n");
        }
    }

    /**
     * Rotate through display modes
     */
    public void updateDisplayMode() {
        if (displayMode == DisplayTypes.BINARY) {
            displayMode = DisplayTypes.OCTAL;
        } else if (displayMode == DisplayTypes.OCTAL) {
            displayMode = DisplayTypes.DECIMAL;
        } else if (displayMode == DisplayTypes.DECIMAL) {
            displayMode = DisplayTypes.HEXADECIMAL;
        } else {
            displayMode = DisplayTypes.BINARY;
        }
    }

    /**
     * Update the display mode through passed argument
     *
     * @param type takes a display type enum
     */
    public void updateDisplayMode(DisplayTypes type) {
        displayMode = type;
    }

    public String implementDisplayMode(double result) {
        String updatedResult;
        int intResult = (int) result;
        switch (displayMode) {
            case OCTAL:
                String octal = "";
                for (int i = intResult; i > 0; i /= 8) {
                    if (i % 8 == 0) {
                        octal = "0" + octal;
                    } else {
                        octal = (i % 8) + octal;
                    }
                }
                updatedResult = octal;
                break;
            case HEXADECIMAL:
                String hexadecimal = "";
                for (int i = intResult; i > 0; i /= 16) {
                    if (i % 16 == 0) {
                        hexadecimal = "0" + hexadecimal;
                    } else {
                        hexadecimal = (i % 16) + hexadecimal;
                    }
                }
                updatedResult = hexadecimal;
                break;
            case BINARY:
                String binary = "";
                for (int i = intResult; i > 0; i /= 2) {
                    if (i % 2 == 0) {
                        binary = "0" + binary;
                    } else {
                        binary = "1" + binary;
                    }
                }
                updatedResult = binary;
                break;
            default:
                updatedResult = String.valueOf(result);
                break;
        }
        return updatedResult;
    }
}

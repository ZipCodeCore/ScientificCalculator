package io.michaelcarroll;

import javax.swing.JOptionPane;

import static java.lang.Double.NaN;
import static java.lang.Double.isInfinite;

/**
 * Displays the current value and directs commands from user to calculator
 */

public class Display {

    public Display() {
        System.out.println("CALCULATOR ON");
    }

    Calculator calculator = new Calculator();
    User user = new User();
    private static double currentNumberOnDisplay;
    public static Units currentUnit = Units.DEGREES;
    public static DisplayMode currentDisplayMode = DisplayMode.DECIMAL;
    private boolean calculatorOn = true;
    private double decimalNumber;
    private String commandEntered;
    private String binaryNumber;
    private String octalNumber;
    private String hexNumber;


    public void runCalculator() {
        showCommandMenu();
        while (calculatorOn) {
            checkCurrentNumberOnDisplay();
            showCurrentNumberOnDisplay();
            commandEntered = user.getCommandFromUser().toUpperCase();
            Operations operation = Operations.valueOf(commandEntered);
            switch (operation) {
                case ADD:
                    currentNumberOnDisplay = calculator.addValues(currentNumberOnDisplay, user.getNumberFromUser());
                    break;
                case SUBTRACT:
                    currentNumberOnDisplay = calculator.subtractValues(currentNumberOnDisplay, user.getNumberFromUser());
                    break;
                case MULTIPLY:
                    currentNumberOnDisplay = calculator.multiplyValues(currentNumberOnDisplay, user.getNumberFromUser());
                    break;
                case DIVIDE:
                    currentNumberOnDisplay = calculator.divideValues(currentNumberOnDisplay, user.getNumberFromUser());
                    break;
                case SQUAREROOT:
                    currentNumberOnDisplay = calculator.calculateSquareRootOfNumberOnDisplay(currentNumberOnDisplay);
                    break;
                case SQUARE:
                    currentNumberOnDisplay = calculator.calculateTheSquareOfNumberOnDisplay(currentNumberOnDisplay);
                    break;
                case INVERSE:
                    currentNumberOnDisplay = calculator.calculateInverseOfNumberOnDisplay(currentNumberOnDisplay);
                    break;
                case EXPONENTIAL:
                    currentNumberOnDisplay = calculator.calculateVariableExponentiation(currentNumberOnDisplay, user.getNumberFromUser());
                    break;
                case CLEAR:
                    currentNumberOnDisplay = calculator.clearNumberOnDisplay();
                    break;
                case INVERT:
                    currentNumberOnDisplay = calculator.invertSignOfCurrentNumberOnDisplay(currentNumberOnDisplay);
                    break;
                case SAVE:
                    System.out.println("Store a number in storage");
                    calculator.storeAValueInMemory(user.getNumberFromUser());
                    break;
                case RETRIEVE:
                    System.out.println("Number stored in Memory: ");
                    System.out.println(calculator.getValueStoredInMemory());
                    break;
                case RESETMEM:
                    System.out.println("Memory value is now 0");
                    calculator.resetValueStoredInMemory();
                    break;
                case SIN:
                    currentNumberOnDisplay = calculator.calculateTheSineOfValueOnDisplay(currentNumberOnDisplay);
                    break;
                case COS:
                    currentNumberOnDisplay = calculator.calculateTheCosineOfValueOnDisplay(currentNumberOnDisplay);
                    break;
                case TAN:
                    currentNumberOnDisplay = calculator.calculateTheTangentOfTheDisplayedValue(currentNumberOnDisplay);
                    break;
                case ISINE:
                    currentNumberOnDisplay = calculator.calculateInverseSineOfValueOnDisplay(currentNumberOnDisplay);
                    break;
                case ICOS:
                    currentNumberOnDisplay = calculator.calculateTheInverseCosineOfValueOnDisplay(currentNumberOnDisplay);
                    break;
                case ITAN:
                    currentNumberOnDisplay = calculator.calculateTheInverseTangentOfTheValueOnDisplay(currentNumberOnDisplay);
                    break;
                case LOG:
                    currentNumberOnDisplay = calculator.calculateTheLogOfValueOnDisplay(currentNumberOnDisplay);
                    break;
                case ILOG:
                    currentNumberOnDisplay = calculator.calculateTheInverseLogOfValueOnDisplay(currentNumberOnDisplay);
                    break;
                case LN:
                    currentNumberOnDisplay = calculator.calculateTheNaturalLogarithmOfValueOnDisplay(currentNumberOnDisplay);
                    break;
                case EX:
                    currentNumberOnDisplay = calculator.calculateInverseNaturalLogarithmOfValueOnDisplay(currentNumberOnDisplay);
                    break;
                case FACT:
                    currentNumberOnDisplay = calculator.calculateTheFactorialOfValueOnDisplay(currentNumberOnDisplay);
                    break;
                case DISPLAY:
                    System.out.println("Enter  BINARY, OCTAL, DECIMAL, HEXDECIMAL or ROTATE ");
                    String mode = user.getCommandFromUser().toUpperCase();
                    switchDisplayMode(mode);
                    break;
                case UNITS:
                    System.out.println("Enter  DEGREES, RADIANS or ROTATE: ");
                    String changeUnit = user.getCommandFromUser().toUpperCase();
                    switchUnitsMode(changeUnit);
                    break;
                case OFF:
                    calculatorOn = false;
                    break;
                case MENU:
                    showCommandMenu();
                    break;
                default:
                    System.out.println("Did not enter a valid command");
                    break;
            }
        }
    }

    public void switchDisplayMode() {
        if (currentDisplayMode == DisplayMode.DECIMAL) {
            currentDisplayMode = DisplayMode.HEXDECIMAL;
        }
        if (currentDisplayMode == DisplayMode.HEXDECIMAL) {
            currentDisplayMode = DisplayMode.BINARY;
        }
        if (currentDisplayMode == DisplayMode.BINARY) {
            currentDisplayMode = DisplayMode.OCTAL;
        }
        if (currentDisplayMode == DisplayMode.OCTAL) {
            currentDisplayMode = DisplayMode.DECIMAL;
        }
    }

    public void switchDisplayMode(String mode) {
        DisplayMode displayMode = DisplayMode.valueOf(mode);
        switch (displayMode) {
            case BINARY:
                binaryNumber = convertValueToBinary(currentNumberOnDisplay);
                System.out.println(binaryNumber);
                break;
            case OCTAL:
                octalNumber = convertValueToOctal(currentNumberOnDisplay);
                System.out.println(octalNumber);
                break;
            case DECIMAL:
                decimalNumber = currentNumberOnDisplay;
                break;
            case HEXDECIMAL:
                hexNumber = convertValueToHex(currentNumberOnDisplay);
                System.out.println(hexNumber);
                break;
            case ROTATE:
                switchDisplayMode();
                break;
            default:
                System.out.println("Input was not BINARY, OCTAL, DECIMAL, HEXDECIMAL or ROTATE");
                break;
        }
    }

    public void switchUnitsMode() {
        if (currentUnit == Units.RADIANS) {
            currentUnit = Units.DEGREES;
        }
        if (currentUnit == Units.DEGREES) {
            currentUnit = Units.RADIANS;
        }
    }

    public void switchUnitsMode(String changeUnit) {
        Units units = Units.valueOf(changeUnit);
        switch (units) {
            case DEGREES:
                currentUnit = Units.DEGREES;
                break;
            case RADIANS:
                currentUnit = Units.RADIANS;
                break;
            case ROTATE:
                switchUnitsMode();
            default:
                System.out.println("Input was not DEGREES, RADIANS, or ROTATE");
        }
    }

    public double getCurrentNumberOnDisplay() {
        return currentNumberOnDisplay;
    }

    public void setCurrentNumberOnDisplay(double currentNumberOnDisplay) {
        this.currentNumberOnDisplay = currentNumberOnDisplay;
    }

    public void showCurrentNumberOnDisplay() {
        System.out.println("Current Number On Display: " + currentNumberOnDisplay);
    }

    public String convertValueToBinary(double value) {
        String doubleToString = Double.toString(value);
        String[] converterArray = doubleToString.split("\\.");
        String convertedValueOnLeft = Integer.toBinaryString(Integer.parseInt(converterArray[0]));
        String convertedValueOnRight = Integer.toBinaryString(Integer.parseInt(converterArray[1]));
        String periodSeparator = " 00101110 ";
        return convertedValueOnLeft + periodSeparator + convertedValueOnRight;

    }

    public String convertValueToHex(double value) {
        String doubleToString = Double.toString(value);
        String[] converterArray = doubleToString.split("\\.");
        String convertedValueOnLeft = Integer.toHexString((Integer.parseInt(converterArray[0])));
        String convertedValueOnRight = Integer.toHexString(Integer.parseInt(converterArray[1]));
        String periodSeparator = ".";
        return convertedValueOnLeft + periodSeparator + convertedValueOnRight;

    }

    public String convertValueToOctal(double value) {
        String doubleToString = Double.toString(value);
        String[] converterArray = doubleToString.split("\\.");
        String convertedValueOnLeft = Integer.toOctalString((Integer.parseInt(converterArray[0])));
        String convertedValueOnRight = Integer.toOctalString(Integer.parseInt(converterArray[1]));
        String periodSeparator = ".";
        return convertedValueOnLeft + periodSeparator + convertedValueOnRight;
    }

    public void checkCurrentNumberOnDisplay() {
        if (isInfinite(currentNumberOnDisplay) || currentNumberOnDisplay == NaN) {
            System.out.println("Err");
            currentNumberOnDisplay = calculator.clearNumberOnDisplay();
        }
    }


    public void showCommandMenu() {
        JOptionPane.showMessageDialog(null, "----------------COMMAND MENU--------------------------\n" +
                "ADD - Add number to current number on display\n" +
                "SUBTRACT - Subtract number from current number on display\n" +
                "MULTIPLY - Multiply number to current number on display\n" +
                "DIVIDE - Divide number by current number on display\n" +
                "SQUAREROOT - Find the square root of the curent number on display\n" +
                "SQUARE - Square the current number on the display\n" +
                "INVERSE - Find the inverse of the current number\n" +
                "EXPONENTIAL - Find the varaible exponentiation of current number on display\n" +
                "CLEAR - Clear the current number on display\n" +
                "INVERT - Invert the sign of the current number on display\n" +
                "SAVE - Store a value in memory for later\n" +
                "RETRIEVE - Retrieve the number in memory\n" +
                "RESETMEM - Reset the current number in memory to 0\n" +
                "SIN - Calculate the Sine of the current number on display\n" +
                "COS - Calculate the Cosine of the current number on display \n" +
                "TAN - Calculate the Tangent of the current number on display\n" +
                "ISINE - Calculate the Inverse Sine of number on display\n" +
                "ICOS - Calculate the Inverse Cosine of the number on display\n" +
                "ITAN - Calculate the Inverse Tangent of the number on display\n" +
                "LOG - Calculate the logarithm of the number on display\n" +
                "ILOG - Calculate the Inverse Logarithm of the number on display\n" +
                "LN - Calculate the Natural Logarithm of the number on dispaly\n" +
                "EX - Calculate the Inverse Natural Logarithm\n" +
                "FACT - Calcualte the factorial of the number on display\n" +
                "DISPLAY - Switch Display Mode to BINARY, OCTAL, DECIMAL, HEXADECIMAL or ROTATE\n" +
                "UNITS - Switch Unit Mode to DEGREES, RADIANS, or ROTATE\n" +
                "OFF - Turn the Calculator Off\n" +
                "MENU - Display the Menu");
    }


}

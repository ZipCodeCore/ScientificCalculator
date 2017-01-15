package squier.john.calculatorProject;

import static java.lang.Double.MAX_EXPONENT;
import static java.lang.Double.NaN;

/**
 * Created by johnsquier on 1/13/17.
 */
public class CalculatorModel {

    private double currentValue;
    private double inputValue;
    private double memoryValue;
    private DisplayModes displayMode;
    private TrigModes trigMode;
    private Operations operations;

    public CalculatorModel() {
        currentValue = 0.0;
        inputValue = 0.0;
        memoryValue = 0.0;
        displayMode = DisplayModes.DECIMAL;
        trigMode = TrigModes.DEGREES;
        operations = new Operations();
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }
    public double getCurrentValue() {
        return currentValue;
    }

    public void setInputValue(double inputValue) { this. inputValue = inputValue; }
    public double getInputValue() { return inputValue; }

    public void setMemoryValue(double memoryValue) { this.memoryValue = memoryValue; }
    public double getMemoryValue() { return memoryValue; }

    public void setDisplayMode(DisplayModes displayMode) { this.displayMode = displayMode; }
    public DisplayModes getDisplayMode() { return displayMode; }

    public void setTrigMode(TrigModes trigMode) { this.trigMode = trigMode; }
    public TrigModes getTrigMode() { return trigMode; }

    public Operations getOperations() {
        return operations;
    }

    public void updateState(String[] userInput) {
        if ( hasOneArgument(userInput) ) {
            handleOneArgInput(userInput[0]);
        }
        else if ( hasTwoArguments(userInput) ) {
            handleTwoArgInput(userInput);
        }
        else if ( hasThreeNumericArguments(userInput) ) {
            solveQuadratic(userInput);
        }
        else {
            setErrorState();
        }

        resetInputValue();
    }

    public boolean hasOneArgument(String[] input) {
        return (input.length == 1);
    }

    public boolean hasTwoArguments(String[] input) {
        return (input.length == 2);
    }

    public boolean hasThreeNumericArguments(String[] input) {
        return (isArgDouble(input[0]) && isArgDouble(input[1])
                && isArgDouble(input[2]));
    }

    public void handleOneArgInput(String input) {
        if ( isArgDouble(input) ) {
            currentValue = inputValue;
        }
        else if ( isArgMemoryOperation(input) ) {
            handleMemoryOperation(input);
        }
        else if ( isArgSwitchDisplayUnit(input) ) {
            setDisplayMode(displayMode.advanceDisplayMode());
        }
        else if ( isArgSwitchTrigUnit(input) ) {
            setTrigMode(trigMode.advanceTrigMode());
        }
        else {
            currentValue = updateCalculatorWithNoArgOperation(input);
        }
    }

    public void handleTwoArgInput(String[] input) {
        if ( isArgDouble(input[1]) ) {
            currentValue = updateCalculatorWithOperationAndNumber(input[0]);
        }
        else {
            setErrorState();
        }
    }

    public void solveQuadratic(String[] input) {
        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);
        double c = Double.parseDouble(input[2]);

        double determinant = (b*b) - (4 * a * c);

        if ( determinant >= 0 ) {
            setCurrentValue(-b + Math.sqrt(determinant)/(2 * a));
            setMemoryValue(-b - Math.sqrt(determinant)/(2 * a));
        }
    }

    public boolean isArgDouble(String input) {
        try {
            // also sets input value, not good
            inputValue = Double.parseDouble(input);
            return true;
        }
        catch ( NumberFormatException e ) {
            return false;
        }
    }

    public boolean isArgMemoryOperation(String input) {
        return ( input.equalsIgnoreCase("M+")
                || input.equalsIgnoreCase("MC")
                || input.equalsIgnoreCase("MRC") );
    }

    public boolean isArgSwitchDisplayUnit(String input) {
        return input.equalsIgnoreCase("sdu");
    }

    public boolean isArgSwitchTrigUnit(String input) {
        return input.equalsIgnoreCase("stu");
    }

    public void handleMemoryOperation(String input) {
        if ( input.equalsIgnoreCase("M+") ) {
            memoryValue += currentValue;
        }
        else if ( input.equalsIgnoreCase("MC") ) {
            memoryValue = 0.0;
        }
        //MRC
        else {
            currentValue = memoryValue;
        }
    }
    public double updateCalculatorWithNoArgOperation(String operation) {
        return operations.performCalculation(operation, currentValue,
                0.0, trigMode);
    }

    public double updateCalculatorWithOperationAndNumber(String operation) {
        return operations.performCalculation(operation, currentValue,
                inputValue, trigMode);
    }

    public void resetInputValue() {
        inputValue = 0.0;
    }

    public void setErrorState() {
        currentValue = NaN;
    }

    /* Old version of updateState, ugly and hard to read, love ya Uncle Bob!
    public void updateStateDeprecated(String[] splitUserInput) {
        if (splitUserInput.length == 1) {
            // check if the first arg is a double
            try {
                inputValue = Double.parseDouble(splitUserInput[0]);
            } catch (NumberFormatException e) {
                // if it isn't
                currentValue = operations.performCalculation(splitUserInput[0], currentValue, 0.0);
                return;
            }

            // if the first arg is a number
            currentValue = operations.performCalculation("+", 0.0, inputValue);
        }
        else if (splitUserInput.length == 2) {
            // check if the second arg is a double
            try {
                inputValue = Double.parseDouble(splitUserInput[1]);
            }
            // if the second arg is not a double
            catch (NumberFormatException e) {
                currentValue = NaN;
                return;
            }
            currentValue = operations.performCalculation(splitUserInput[0], currentValue, inputValue);
        }
        else {
            currentValue = NaN;
    }

        inputValue = 0.0;
    }
*/
}

package squier.john.calculatorProject;

import static java.lang.Double.NaN;

/**
 * Created by johnsquier on 1/13/17.
 */
public class CalculatorModel {

    private double currentValue;
    private double inputValue;
    private double memoryValue;
    private DisplayModes displayMode = DisplayModes.DECIMAL;
    private Operations operations;

    public CalculatorModel() {
        currentValue = 0.0;
        inputValue = 0.0;
        memoryValue = 0.0;
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

    public Operations getOperations() {
        return operations;
    }

    public void updateState(String[] splitUserInput) {
        if ( hasOneArgument(splitUserInput) ) {
            handleOneArgInput(splitUserInput[0]);
        }
        else if ( hasTwoArguments(splitUserInput) ) {
            handleTwoArgInput(splitUserInput);
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

    public void handleOneArgInput(String input) {
        if ( isArgDouble(input) ) {
            currentValue = resetCalculatorWithNumber();
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

    public boolean isArgDouble(String input) {
        try {
            inputValue = Double.parseDouble(input);
            return true;
        }
        catch ( NumberFormatException e ) {
            return false;
        }
    }

    public double resetCalculatorWithNumber() {
        return operations.performCalculation("+", 0.0, inputValue);
    }

    public double updateCalculatorWithNoArgOperation(String operation) {
        return operations.performCalculation(operation, currentValue, 0.0);
    }

    public double updateCalculatorWithOperationAndNumber(String operation) {
        return operations.performCalculation(operation, currentValue, inputValue);
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

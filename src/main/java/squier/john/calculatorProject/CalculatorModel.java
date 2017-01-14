package squier.john.calculatorProject;

/**
 * Created by johnsquier on 1/13/17.
 */
public class CalculatorModel {

    private double currentValue;
    private double inputValue;
    private Operations operations;

    public CalculatorModel() {
        currentValue = 0.0;
        inputValue = 0.0;
        operations = new Operations();
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public Operations getOperations() {
        return operations;
    }

    public void updateState(String[] splitUserInput) {
        if ( splitUserInput.length == 1 ) {
            try {
                inputValue = Double.parseDouble(splitUserInput[0]);
            }
            catch ( NumberFormatException e ) {
                currentValue = operations.performCalculation(splitUserInput[0], currentValue, 0.0);
            }
        }
        else {
            inputValue = Double.parseDouble(splitUserInput[1]);
            currentValue = operations.performCalculation(splitUserInput[0], currentValue, inputValue);
        }
    }


}

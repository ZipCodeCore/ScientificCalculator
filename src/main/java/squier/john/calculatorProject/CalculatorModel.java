package squier.john.calculatorProject;

/**
 * Created by johnsquier on 1/13/17.
 */
public class CalculatorModel {

    private double currentValue;
    private Operations operations;

    public CalculatorModel() {
        currentValue = 0.0;
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


}

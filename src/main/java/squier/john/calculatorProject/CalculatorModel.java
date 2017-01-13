package squier.john.calculatorProject;

/**
 * Created by johnsquier on 1/13/17.
 */
public class CalculatorModel {

    private double currentValue;

    public CalculatorModel() {
        currentValue = 0.0;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public double getCurrentValue() {
        return currentValue;
    }


}

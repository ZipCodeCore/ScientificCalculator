package squier.john.calculatorProject;

/**
 * Created by johnsquier on 1/13/17.
 */
public class CalculatorController {

    CalculatorInput calculatorInput;
    CalculatorDisplay calculatorDisplay;
    CalculatorModel calculatorModel;

    public CalculatorController() {
        calculatorInput = new CalculatorInput();
        calculatorDisplay = new CalculatorDisplay();
        calculatorModel = new CalculatorModel();
    }

    public void runCalculator() {

        String operation = "";

        while ( !operation.equalsIgnoreCase("exit") ) {

            calculatorDisplay.displayCurrentState(calculatorModel.getCurrentValue());
            calculatorDisplay.displayAvailableOperations(calculatorModel.getOperations().getAvailableOperations());
        }
    }
}

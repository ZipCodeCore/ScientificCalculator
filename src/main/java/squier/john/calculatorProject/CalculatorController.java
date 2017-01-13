package squier.john.calculatorProject;

/**
 * Created by johnsquier on 1/13/17.
 */
public class CalculatorController {

    CalculatorInput calculatorInput;
    CalculatorDisplay calculatorDisplay;
    CalculatorModel calculatorModel;
    CalculatorParser calculatorParser;

    public CalculatorController() {
        calculatorInput = new CalculatorInput();
        calculatorDisplay = new CalculatorDisplay();
        calculatorModel = new CalculatorModel();
        calculatorParser = new CalculatorParser();
    }

    public void runCalculator() {

        String operation = "";

        while ( !operation.equalsIgnoreCase("exit") ) {

            calculatorDisplay.displayCurrentState(calculatorModel.getCurrentValue());
            calculatorDisplay.displayAvailableOperations(calculatorModel.getOperations().getAvailableOperations());
            calculatorDisplay.displayInputPrompt();

            String userInput = calculatorInput.getUserInput();

            String[] splitUserInput = calculatorParser.parseUserInput(userInput);

            if ( !(splitUserInput.length == 0) ) {
                operation = splitUserInput[0];
            }
        }
    }
}

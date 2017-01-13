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

        //boolean keepLooping = true; change loop condition

        while ( !firstUserArg.equalsIgnoreCase("exit") ) {

            double currentValue = calculatorModel.getCurrentValue();
            calculatorDisplay.displayCurrentState(currentValue);

            calculatorDisplay.displayAvailableOperations(calculatorModel.getOperations().getAvailableOperations());
            calculatorDisplay.displayInputPrompt();

            String userInput = calculatorInput.getUserInput();

            String[] splitUserInput = calculatorParser.parseUserInput(userInput);

            if ( (splitUserInput.length == 0)
                    || (splitUserInput.length > 2)) {
                // handle error case
            }
            else {
                calculatorModel.updateState(splitUserInput);
            }
        }
    }
}
